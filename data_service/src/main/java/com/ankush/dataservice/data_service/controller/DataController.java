package com.ankush.dataservice.data_service.controller;

import com.ankush.dataservice.data_service.entities.Data;
import com.ankush.dataservice.data_service.repository.DataRepository;
import com.ankush.dataservice.data_service.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data")
public class DataController {


    @Autowired
    DataService dataService;



    @GetMapping("live")
    public String live()
    {
        return "Live ....";
    }


/*
    @GetMapping("/user/{userId}")
    public List<Data> getData(@PathVariable("userId") Long userId)
    {
        return this.dataService.getDataofUser(userId);
    }
*/

    //  C R U D
    @PostMapping("/add")
    public String saveData(@RequestBody Data data)
    {
        this.dataService.addData(data);
        return "Data added Successfully";
    }

    @GetMapping("/user/{userId}")
    public List<Data> getUserData(@PathVariable("userId") Long userId)
    {
        return this.dataService.getData(userId);

    }

    @DeleteMapping("/user/{userId}")
    public String DeleteUser(@PathVariable("userId") Long userId)
    {
        return this.dataService.deleteUser(userId);
    }



}
