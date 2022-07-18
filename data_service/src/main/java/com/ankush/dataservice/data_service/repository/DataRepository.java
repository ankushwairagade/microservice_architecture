package com.ankush.dataservice.data_service.repository;

import com.ankush.dataservice.data_service.entities.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataRepository  extends JpaRepository<Data, Long> {


    void deleteByUserId(Long userId);
}
