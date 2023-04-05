package com.example.ao.angolar.tupuca.dao;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AddressDao {

    @NotBlank
    private String street;

    @NotBlank
    private String district;

    @NotBlank
    private String country;
}
