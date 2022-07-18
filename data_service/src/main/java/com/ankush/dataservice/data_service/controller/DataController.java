package com.ankush.dataservice.data_service.controller;

import com.ankush.dataservice.data_service.entities.Data;
import com.ankush.dataservice.data_service.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data")
public class DataController {


    @Autowired
    DataService dataService;

    @GetMapping("/user/{userId}")
    public List<Data> getData(@PathVariable("userId") Long userId)
    {
        return this.dataService.getDataofUser(userId);
    }

}
