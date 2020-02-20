package com.psych.game;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev-test")
class HelloWorldController {
    @GetMapping("/")
    public String hello() {
        return "Hello, World";
    }
}

/*
jdbc:postgresql://localhost:5432/psych_local
*/