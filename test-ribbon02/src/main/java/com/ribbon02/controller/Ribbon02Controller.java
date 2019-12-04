package com.ribbon02.controller;

import com.ribbon02.api.TestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ribbon02Controller {

    @Autowired
    private TestApi testApi;

    @RequestMapping("test02/{name}")
    public String test02(@PathVariable("name")String name){
        return testApi.test03(name);
    }

}
