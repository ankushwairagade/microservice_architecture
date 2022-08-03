package com.ankush.SpringBootRedis.service;

import com.ankush.SpringBootRedis.model.User;

public interface UserService {
    boolean saveUser(User user);

    Object fetchAllUser();

    boolean deleteUser(Long userId);

    boolean updateUser(User user);
}
