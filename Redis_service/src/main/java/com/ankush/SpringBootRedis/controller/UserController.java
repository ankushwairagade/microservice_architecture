package com.ankush.SpringBootRedis.controller;

import com.ankush.SpringBootRedis.model.User;
import com.ankush.SpringBootRedis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/redis")
public class UserController {

    @Autowired
    private UserService userService;

@GetMapping("/live")
public String home()
{
    return "welcome to Redis in-memory databases";
}
    @PostMapping("/user")
    public ResponseEntity<String> SaveUser(@RequestBody User user)
    {
        boolean result = userService.saveUser(user);
            if(result)
            {
                return ResponseEntity.ok("User created successfully...");
            }else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
    }


    @GetMapping("/user")
    public ResponseEntity<List<User>> fetchUser()
    {
        List<User> users;
        users = (List<User>) userService.fetchAllUser();

        return ResponseEntity.ok(users);
    }


    @DeleteMapping("/user/{userId}")
    public ResponseEntity<String> DeleteUser(@PathVariable("userId") Long userId)
    {
        boolean result = this.userService.deleteUser(userId);
        if(result)
        {
            return ResponseEntity.ok("User Delete successfully...");
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }


    @PutMapping("/user")
    public ResponseEntity<String> UpdateUser(@RequestBody User user)
    {
        boolean result = userService.updateUser(user);
        if(result)
        {
            return ResponseEntity.ok("User created successfully...");
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
