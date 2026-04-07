package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // 이거 붙이면 Spring이 Controller로 인식
public class HelloController {
    @GetMapping("/api/hello") // GET 요청 받는 API
    public String hello () {
        return "Hello Backend!";
    }
}
