package com.novapay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NovaPayApplication {

    public static void main(String[] args) {
        SpringApplication.run(NovaPayApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "NovaPay Digital Bank - Version 1";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}
