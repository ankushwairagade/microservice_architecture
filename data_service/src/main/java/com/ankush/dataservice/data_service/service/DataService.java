package com.ankush.dataservice.data_service.service;

import com.ankush.dataservice.data_service.entities.Data;

import java.util.List;

public interface DataService {

    public List<Data> getDataofUser(Long userId);
}
