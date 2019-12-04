package com.ribbon02.api;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Ribbon03",fallback = FallBack.class)
@Hystrix
public interface TestApi {

    @RequestMapping("test03")
    public String test03(@RequestParam("name")String name);
}
