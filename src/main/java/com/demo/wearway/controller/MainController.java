package com.demo.wearway.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/main")
public class MainController {
    @GetMapping("/hello")
    public String hello() { return "Hello World!"; }
    @GetMapping("/bye")
    public String bye() { return "Bye World!"; }
    @PostMapping("/getPerson")
    public String getPerson(@RequestBody Map<String, String> map) {
        return "Hello " + map.get("id");
    }
}
