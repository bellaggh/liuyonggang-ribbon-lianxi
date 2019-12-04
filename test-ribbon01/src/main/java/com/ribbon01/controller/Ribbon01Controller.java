package com.ribbon01.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ribbon01Controller {

    @RequestMapping("test01/{name}")
    @HystrixCommand(fallbackMethod = "fallback")
    public String test(@PathVariable("name")String name){
        if(("1").equals(name)){
            throw  new RuntimeException("============出错了============");
        }
        System.out.println("====================");
        return name;
    }

    public String fallback(String name){
        return "=========报错========";
    }
}
