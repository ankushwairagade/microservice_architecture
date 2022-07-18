package com.ankush.userservice.user_service.service;

import com.ankush.userservice.user_service.entities.User;
import com.ankush.userservice.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImple implements UserService{

    @Autowired
            private UserRepository userRepository;


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

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    // i'm doing wrong thing here, instead of use hibernate / sql queries;
    @Override
    public User getUserinfo(Long userId) {

        List<User> ls = this.userRepository.findAll();

        for(User u : ls)
        {
            if(u.getUserId() == userId)
            {
                return u;
            }
        }

        return null;
    }

    @Override
    public void deleteUser(Long userId) {
        this.userRepository.deleteById(userId);
    }


}
