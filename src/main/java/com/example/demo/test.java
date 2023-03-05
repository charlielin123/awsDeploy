package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    
    @GetMapping("/hello")
    public String name() {
        return " skldflskadfjasdf";
    }
    @GetMapping("/")
    public String name2() {
        return "你好啊 旅行者";
    }
}
