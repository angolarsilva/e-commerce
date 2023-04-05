package com.example.ao.angolar.tupuca.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table( name = "tb_contact")
@Data
public class Contact {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column( name = "number")
    private String number;
    @Column( name = "alternative")
    private String alternative_number;
}
