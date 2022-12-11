package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/")
public class TestController {

    private static final String PATH = "C:\\Users\\acan\\Desktop\\新建文件夹\\";

    @PostMapping("/uploadFile")
    public String asdf(@RequestBody MultipartFile[] files) {
        for (MultipartFile file : files) {
            try {
                String filename = file.getOriginalFilename();
                String[] split = filename.split("\\.");
                switch (split[1]) {
                    case "sql":
                    case "bcp":
                        file.transferTo(new File(PATH + filename));
                        break;
                    default:
                }
            } catch (IOException | NullPointerException e) {
                System.out.println("1");
            }
        }
        return "succeed";
    }
}
