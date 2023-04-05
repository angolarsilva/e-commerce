package com.example.ao.angolar.tupuca.dao;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ContactDao {

    @NotBlank
    @Size(min = 9, max = 13)
    private String number;

    private String alternative_number;
}
