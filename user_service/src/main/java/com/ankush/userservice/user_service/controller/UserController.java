package com.ankush.userservice.user_service.controller;

import com.ankush.userservice.user_service.entities.User;
import com.ankush.userservice.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId)
    {
       User user = this.userService.getUser(userId);

        // http://localhost:9002/data/user/13
        //DATA-SERVICE
        List datalist =this.restTemplate.getForObject("http://data-service/data/user/"+userId, List.class);

        user.setDataList(datalist);

        return user;
    }

}
