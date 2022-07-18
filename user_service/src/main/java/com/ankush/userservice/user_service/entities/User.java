package com.ankush.userservice.user_service.entities;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@lombok.Data
@Entity
public class User {

    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private  Long userId;
    private String name;
    private String email;

    @Transient
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

