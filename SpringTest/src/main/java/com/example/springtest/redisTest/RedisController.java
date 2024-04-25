package com.example.springtest.redisTest;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author acan
 * @version 2024/01/25 04:58
 */
@RestController
public class RedisController {

    private final RedisService rs;

    @Autowired
    public RedisController(RedisService rs) {
        this.rs = rs;
    }

    @GetMapping("testRedis")
    public Object asdf() {
        List<UserBean> kkk = rs.asdf("kkk");
        kkk.forEach(System.out::println);
        return "2";
    }
}
