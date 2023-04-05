package com.example.ao.angolar.tupuca.dao;

import com.example.ao.angolar.tupuca.model.entity.Customer;
import com.example.ao.angolar.tupuca.model.entity.Product;
import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class OrderDao {

    private int quantity;
//    private Customer customer;
//    private Product product;
    private LocalDate date;
    private LocalTime time;
}
