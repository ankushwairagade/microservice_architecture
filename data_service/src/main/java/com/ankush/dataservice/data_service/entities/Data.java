package com.ankush.dataservice.data_service.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class Data {
    private Long dId;
    private Double fieldX;
    private Double fieldY;

    private Long userId;
}
