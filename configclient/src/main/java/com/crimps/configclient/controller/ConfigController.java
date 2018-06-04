package com.crimps.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${test}")
    private String testValue;

    @Value("${info.from}")
    private String testInfo;

    @GetMapping("testValue")
    public void testValue(){
        System.out.println("####" + testValue);
        System.out.println("####" + testInfo);
    }
}
