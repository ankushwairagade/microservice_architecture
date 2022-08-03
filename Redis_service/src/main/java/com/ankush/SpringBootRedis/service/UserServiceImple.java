package com.ankush.SpringBootRedis.service;

import com.ankush.SpringBootRedis.model.User;
import com.ankush.SpringBootRedis.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImple implements UserService{

  @Autowired
    UserDao userDao;

    @Override
    public boolean saveUser(User user) {
        return  userDao.saveUser(user);
    }

    @Override
    public Object fetchAllUser() {
        return userDao.fetchAllUser();
    }

    @Override
    public boolean deleteUser(Long userId) {
        return userDao.deleteUser(userId);
    }

    @Override
    public boolean updateUser(User user) {

        return userDao.saveUser(user);

    }
}
