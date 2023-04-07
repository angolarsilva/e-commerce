package com.example.ao.angolar.tupuca.dao;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class OrderDto {

    private int quantity;
//    private Customer customer;
//    private Product product;
    private LocalDate date;
    private LocalTime time;
}
