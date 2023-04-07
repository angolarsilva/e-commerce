package com.example.ao.angolar.tupuca.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class OrderDto {

    private int quantity;
    private LocalDate date;
    private LocalTime time;
}
