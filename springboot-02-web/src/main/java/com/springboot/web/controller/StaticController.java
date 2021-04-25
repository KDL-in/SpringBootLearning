package com.springboot.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaticController {
    @RequestMapping("map.png")
    public String map() {
        return "aaa";
    }
}
