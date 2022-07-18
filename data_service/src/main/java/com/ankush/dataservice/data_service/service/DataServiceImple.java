package com.ankush.dataservice.data_service.service;

import com.ankush.dataservice.data_service.entities.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DataServiceImple implements DataService {

    // fake List of Data

    List<Data> list = List.of(
            new Data(1L,31.4,0.6,12L),
            new Data(2L,4.41,1.2,12L),
            new Data(3L,34.1,31.1,12L),
            new Data(4L,67.7,10.2,13L),
            new Data(5L,99.0,2.2,13L),
            new Data(6L,98.9,91.2,14L)
    );

    @Override
    public List<Data> getDataofUser(Long userId) {
        return list.stream().filter(data -> data.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
