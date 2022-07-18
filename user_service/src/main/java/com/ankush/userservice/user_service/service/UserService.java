package com.ankush.userservice.user_service.service;

import com.ankush.userservice.user_service.entities.User;
import org.springframework.stereotype.Service;


public interface UserService {

    public User getUser(Long id);
}
