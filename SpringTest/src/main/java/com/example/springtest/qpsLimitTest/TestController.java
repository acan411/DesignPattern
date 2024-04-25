package com.example.springtest.qpsLimitTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author acan
 * @version 2023/12/09 14:12
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/1")
    @QpsLimit(key = "10", permitsPerSecond = 100, timeout = 10000)
    public Object limit1() {
        System.out.println(11111);
        return "ok";
    }
}
