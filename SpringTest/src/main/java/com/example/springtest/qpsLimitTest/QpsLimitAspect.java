package com.example.springtest.qpsLimitTest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

/**
 * @author acan
 * @version 2023/12/09 13:47
 */

@Aspect
@Component
public class QpsLimitAspect {

    private final Map<String, RateLimiter> limitMap = new ConcurrentHashMap<>();

    @Around("@annotation(limit)")
    public Object qpsLimit(ProceedingJoinPoint joinPoint, QpsLimit limit) throws InterruptedException, ExecutionException {
        String key = limit.key();
        RateLimiter rateLimiter;
        if (!limitMap.containsKey(key)) {
            int permitsPerSecond = limit.permitsPerSecond();
            rateLimiter = new RateLimiter(permitsPerSecond, permitsPerSecond);
            limitMap.put(key, rateLimiter);
            System.out.printf("新建令牌桶%s, 容量%s\n", key, permitsPerSecond);
        }
        rateLimiter = limitMap.get(key);
        boolean acquire = rateLimiter.acquire();
        if (!acquire) {
            System.out.printf("令牌桶%s获取令牌失败\n", key);
            return new ResponseEntity<>(new HashMap<>() {{
                put("data", "服务异常, 请稍后重试");
            }}, HttpStatusCode.valueOf(503));
        }

        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Object> future = executorService.submit(() -> {
            try {
                return joinPoint.proceed();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        });
        long start = System.currentTimeMillis();
        while (true) {
            Thread.sleep(1000);
            if (System.currentTimeMillis() - start >= limit.timeout()) {
                return new ResponseEntity<>(new HashMap<>() {{
                    put("data", "服务请求超时, 请稍后重试");
                }}, HttpStatusCode.valueOf(408));
            } else if (future.isDone()) {
                return future.get();
            }
        }
    }
}
