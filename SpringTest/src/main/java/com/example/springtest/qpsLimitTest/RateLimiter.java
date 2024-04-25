package com.example.springtest.qpsLimitTest;

/**
 * @author acan
 * @version 2023/12/09 15:35
 */
public class RateLimiter {

    private final int capacity; // 令牌桶容量
    private final long rate; // 生成令牌的速率，单位：令牌/秒
    private long tokens; // 当前令牌数量
    private long lastRefillTime; // 上次重新填充令牌的时间

    public RateLimiter(int capacity, long rate) {
        this.capacity = capacity;
        this.rate = rate;
        this.tokens = 1;
        this.lastRefillTime = System.currentTimeMillis();
    }

    public boolean acquire() {
        refill();// 先重新填充令牌
        if (tokens > 0) {
            tokens--;
            return true;
        } else {
            return false;
        }
    }

    private void refill() {
        long currentTime = System.currentTimeMillis();
        long elapsedTime = currentTime - lastRefillTime;
        long newTokens = elapsedTime * rate / 1000; // 计算新增的令牌数量
        tokens = Math.min(tokens + newTokens, capacity); // 更新令牌数量，不能超过容量
        lastRefillTime = currentTime;
    }
}
