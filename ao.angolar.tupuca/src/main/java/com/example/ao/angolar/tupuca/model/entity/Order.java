package com.example.ao.angolar.tupuca.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table( name = "tb_order")
public class Order {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "quantity", nullable = false )
    private int quantity;
//    private Customer customer;
//    private Product product;
    @Column( name = "date")
    private LocalDate date;
    @Column( name = "time")
    private LocalTime time;
}
