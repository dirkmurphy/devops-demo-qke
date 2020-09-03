package com.prnasia.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {

    @GetMapping("/")
    public String index() {
        return "<h1>index devops</h1>";
    }
}
