package com.example.ao.angolar.tupuca.dao;

import com.example.ao.angolar.tupuca.model.entity.Address;
import com.example.ao.angolar.tupuca.model.entity.Contact;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class SupplierDao {

    @NotBlank
    private String name;
//    private Address address;
//    @Size( min = 9, max = 13)
//    private Contact contact;
}
