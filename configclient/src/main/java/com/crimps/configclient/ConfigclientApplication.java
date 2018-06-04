package com.crimps.configclient;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ConfigclientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigclientApplication.class).web(true).run(args);
    }
}
