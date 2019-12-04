package com.ribbon02.api;

import org.springframework.stereotype.Component;

@Component
public class FallBack implements TestApi{

    @Override
    public String test03(String name) {
        return "======访问错误=======";
    }
}
