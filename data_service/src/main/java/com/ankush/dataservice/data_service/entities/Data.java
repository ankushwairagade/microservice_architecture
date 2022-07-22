package com.ankush.dataservice.data_service.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Data {
    @Id
    @SequenceGenerator(
            name = "data_sequence",
            sequenceName = "data_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "data_sequence"
    )
    private Long dId;

    private Double fieldX;
    private Double fieldY;




    private Long userId;

    @CreationTimestamp
    private LocalDateTime date;

    public Long getdId() {
        return dId;
    }

    public void setdId(Long dId) {
        this.dId = dId;
    }

    public Double getFieldX() {
        return fieldX;
    }

    public void setFieldX(Double fieldX) {
        this.fieldX = fieldX;
    }

    public Double getFieldY() {
        return fieldY;
    }

    public void setFieldY(Double fieldY) {
        this.fieldY = fieldY;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
