package com.ankush.dataservice.data_service.service;

import com.ankush.dataservice.data_service.entities.Data;
import com.ankush.dataservice.data_service.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DataServiceImple implements DataService {

    @Autowired
    DataRepository dataRepository;

    // fake List of Data

    List<Data> list = List.of(
       //     new Data(1L,31.4,0.6,12L),
        //    new Data(2L,4.41,1.2,12L),
        //    new Data(3L,34.1,31.1,12L),
      //      new Data(4L,67.7,10.2,13L),
        //    new Data(5L,99.0,2.2,13L),
       //     new Data(6L,98.9,91.2,14L)
    );

    @Override
    public List<Data> getDataofUser(Long userId) {
        return list.stream().filter(data -> data.getUserId().equals(userId)).collect(Collectors.toList());
    }

    @Override
    public void addData(Data data) {
        this.dataRepository.save(data);
    }

    @Override
    public List<Data> getData(Long userId) {
      List<Data> ls = this.dataRepository.findAll();
      List<Data> list = new ArrayList<>();
      for(Data d : ls)
      {
          if(d.getUserId() == userId)
          {
              list.add(d);
          }
      }
      return list;
    }

    @Override
    public String deleteUser(Long userId) {

       // this.dataRepository.deleteById(userId);
//        this.dataRepository.deleteByUserId(userId);
     //  this.dataRepository.deleteById(userId);
       List<Data> list = this.dataRepository.findAll();

       for(Data d : list)
       {
           if(d.getUserId() == userId)
           {
               this.dataRepository.delete(d);
           }
       }

        return "User Data Successfully Deleted ";
    }

}
