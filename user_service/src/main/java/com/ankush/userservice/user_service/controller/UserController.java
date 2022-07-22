package com.ankush.userservice.user_service.controller;

import com.ankush.userservice.user_service.entities.User;
import com.ankush.userservice.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.ws.rs.DELETE;
import java.util.List;
import java.util.Optional;

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
       User user = this.userService.getUserinfo(userId);

        // http://localhost:9002/data/user/13
        //DATA-SERVICE
        // rigth now exception is not set    if service get down Error internal 5XX
        List datalist = this.restTemplate.getForObject("http://data-service/data/user/"+userId, List.class);

        user.setDataList(datalist);


        return user;
    }
    @PostMapping("/add")
    public String addUser(@RequestBody User user)
    {
        this.userService.addUser(user);
        return "added user Successfully";
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable("userId") Long userId)
    {
        this.userService.deleteUser(userId);
        return "user Deleted Successfully ...";
    }

    @PutMapping("/{userId}")
    public String updateUser(@RequestBody User user)
    {
        this.userService.updateUSer(user);
        return "updated successfully";
    }
}
