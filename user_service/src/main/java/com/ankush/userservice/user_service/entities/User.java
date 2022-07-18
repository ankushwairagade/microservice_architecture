package com.ankush.userservice.user_service.entities;



import java.util.ArrayList;
import java.util.List;

@lombok.Data
public class User {

    private  Long userId;
    private String name;
    private String email;

    List<Data> dataList = new ArrayList<>();

    public User(Long userId, String name, String email, List<Data> dataList) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.dataList = dataList;
    }

    public User(Long userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public User() {
    }
}

