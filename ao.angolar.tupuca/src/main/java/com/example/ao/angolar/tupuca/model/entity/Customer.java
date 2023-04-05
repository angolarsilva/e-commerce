package com.example.ao.angolar.tupuca.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table( name = "tb_customer")
@Data
public class Customer {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name = "id")
    private Long id;

    @Column( name = "name" )
    private String name;

//    private Address address;
//
//    private Contact contact;

}
