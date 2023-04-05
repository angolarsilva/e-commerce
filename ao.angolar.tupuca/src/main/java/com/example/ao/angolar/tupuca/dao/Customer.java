package com.example.ao.angolar.tupuca.dao;

import com.example.ao.angolar.tupuca.model.entity.Address;
import com.example.ao.angolar.tupuca.model.entity.Contact;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Customer {

    @NotBlank
    private String name;

//    private Address address;

//    private Contact contact;
}
