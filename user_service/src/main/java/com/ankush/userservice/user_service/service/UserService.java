package com.ankush.userservice.user_service.service;

import com.ankush.userservice.user_service.entities.User;

import java.util.Optional;


public interface UserService {

    public User getUser(Long id);

    void addUser(User user);

    User getUserinfo(Long userId);

    void deleteUser(Long userId);
}
