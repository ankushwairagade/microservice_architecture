package com.ankush.SpringBootRedis.repository;

import com.ankush.SpringBootRedis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImple implements UserDao{

    @Autowired
    private RedisTemplate redisTemplate;

    private static final  String KEY="USER";

    @Override
    public boolean saveUser(User user) {

        try{
            // save data

            redisTemplate.opsForHash().put(KEY,user.getId(),user);
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public Object fetchAllUser() {

        List<User> users;
        users=this.redisTemplate.opsForHash().values(KEY);
        return users;

    }

    @Override
    public boolean deleteUser(Long userId) {

        Long d =this.redisTemplate.opsForHash().delete(KEY,userId);
            if(d!=null)
            {
                return true;
            }
        return false;
    }
}
