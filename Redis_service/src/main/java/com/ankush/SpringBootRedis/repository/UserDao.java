package com.ankush.SpringBootRedis.repository;

import com.ankush.SpringBootRedis.model.User;

public interface UserDao {
    boolean saveUser(User user);

    Object fetchAllUser();

    boolean deleteUser(Long userId);
}
