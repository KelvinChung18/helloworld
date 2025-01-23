package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhonghf
 * @date 2025/1/23 10:19
 */
@RestController
public class HelloController {
    @GetMapping("/ping")
    public String pong() {
        return "pong";
    }
}
