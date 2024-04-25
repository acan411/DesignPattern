package priv.acan.testmaven.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author acan
 * @version 2023/03/27 00:45
 */
@CrossOrigin
@RestController
@RequestMapping("/acan")
public class TestController {

    @GetMapping("/test")
    public String acanTest() {
        return "acan 666";
    }
}

