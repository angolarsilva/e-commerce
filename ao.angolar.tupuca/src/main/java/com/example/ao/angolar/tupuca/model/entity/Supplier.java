package com.example.ao.angolar.tupuca.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table( name = "tb_supplier")
@Data
public class Supplier {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( name = "name")
    private String name;

//    private Address address;
//
//    private Contact contact;
}
