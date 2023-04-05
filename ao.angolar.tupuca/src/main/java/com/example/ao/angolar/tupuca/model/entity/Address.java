package com.example.ao.angolar.tupuca.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table( name = "tb_address")
@Data
public class Address {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( name = "street")
    private String street;

    @Column( name = "district")
    private String district;

    @Column( name = "country")
    private String country;
}
