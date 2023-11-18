package com.demo.wearway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeWorldController {

    @GetMapping("/api/main")
    public String test() {
        return "Wearway";
    }
}