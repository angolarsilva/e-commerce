package com.example.ao.angolar.tupuca.dao;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Sale {

    @NotBlank
    private double amount;
//    private Order order;
    private LocalDateTime date;
//    private PaymentEnum paymentEnum;
}
