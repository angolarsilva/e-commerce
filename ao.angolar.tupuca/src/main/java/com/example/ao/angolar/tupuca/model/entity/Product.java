package com.example.ao.angolar.tupuca.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table( name = "tb_product")
@Data
public class Product {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column( name = "name")
    private String name;
    @Column( name = "discount")
    private boolean discount;
    @Column( name = "price")
    private double price;
//    private Supplier supplier;
//    private ProductEnum productEnum;
}
