package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    
    @RequestMapping("/hello")
    public String name() {
        return "<h2> HELLO 87</h2>";
    }

    @RequestMapping("/")
    public String name2() {
        return "<h1>你好啊 旅行者<h1><a href='/hello'>test</a>";
    }
}
