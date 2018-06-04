package com.crimps.eurekaconsumerribbonhystrix.controller;

import com.crimps.eurekaconsumerribbonhystrix.services.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

    @Autowired
    ConsumerService consumerService;

    @GetMapping("hystrix")
    public String dcTimeOut(){
        return consumerService.consumer();
    }
}
