package com.pet.petlife.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {
    @GetMapping("/api/hello")
    public String test() {
        return "Hello, world!";
    }
}
