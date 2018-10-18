package com.spb.spbdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class SpbdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpbdemoApplication.class, args);
    }
}
