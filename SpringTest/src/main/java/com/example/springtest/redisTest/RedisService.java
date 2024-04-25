package com.example.springtest.redisTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author acan
 * @version 2024/01/25 03:56
 */
@Service
@SpringBootTest
public class RedisService {

    private final RedisTemplate<String, Object> rt;
    private final UserMapperDao umd;

    @Autowired
    public RedisService(RedisTemplate<String, Object> rt, UserMapperDao userMapperDao) {
        this.rt = rt;
        this.umd = userMapperDao;
    }

    @Cacheable(value = "cacheName", key = "#key")
    public List<UserBean> asdf(String key) {
        List<UserBean> userBeans = umd.selectList(null);
        System.out.println("没有走缓存");
        return userBeans;
    }

    @Cacheable(value = "cacheName", key = "#key")
    public Object qwer(String key) {
        Object o = rt.opsForValue().get(key);
        return o;
    }
}
