package com.ankush.userservice.user_service.service;

import com.ankush.userservice.user_service.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImple implements UserService{

    // fake user list  --> DB
    List<User> list = List.of(
            new User(12L,"ankush","ankush@kk"),
            new User(13L,"giri","giri@kk"),
            new User(14L,"rohit","rohit@kk"),
            new User(15L,"mangesh","mangesh@kk")
    );


    @Override
    public User getUser(Long id) {
      return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
