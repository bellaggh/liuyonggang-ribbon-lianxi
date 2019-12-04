package com.ribbon03.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ribbon03Controller {

    @RequestMapping("test03")
    public String test03(@RequestParam("name")String name){
        if(("1".equals(name))){
            throw new RuntimeException("=====程序报错=====");
        }
        System.out.println("=========实力被访问========");
        return name;
    }
}
