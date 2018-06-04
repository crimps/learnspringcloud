package com.crimps.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Value("${info.type}")
    private String type;

    @GetMapping("testValue")
    public void testValue(){
        System.out.println("####" + type);
    }
}
