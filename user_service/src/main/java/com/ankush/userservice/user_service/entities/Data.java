package com.ankush.userservice.user_service.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor

public class Data {


    private Long dId;
    private Double fieldX;
    private Double fieldY;

    private Long userId;


}
