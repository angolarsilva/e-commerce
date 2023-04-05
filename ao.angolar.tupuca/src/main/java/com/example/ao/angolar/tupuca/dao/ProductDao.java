package com.example.ao.angolar.tupuca.dao;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class ProductDao {

    @NotBlank
    private String name;
    private boolean discount;
    @Positive
    private double price;
//    private Supplier supplier;
//    private ProductEnum productEnum;
}
