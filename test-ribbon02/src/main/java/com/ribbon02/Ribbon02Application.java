package com.ribbon02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableCircuitBreaker
@EnableFeignClients
public class Ribbon02Application {
    public static void main(String[] args) {
        SpringApplication.run(Ribbon02Application.class);
    }

    @RequestMapping("testHealth")
    public String testHealth(){
        System.out.println("========Ribbon02Health========");
        return "OK";
    }
}
