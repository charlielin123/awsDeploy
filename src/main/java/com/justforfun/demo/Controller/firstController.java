package com.justforfun.demo.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class firstController {

    @GetMapping("/")
    public String test1() {
        return "成功";
    }

}
