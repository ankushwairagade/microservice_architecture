package com.ankush.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Retention;

@RestController
public class FallBackController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBack()
    {
        return "User service is down at this time !! ";
    }

    @GetMapping("/dataServiceFallBack")
    public String dataServiceFallBack()
    {
        return "data service is down at this time !! ";
    }
}
