package com.example.ao.angolar.tupuca.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_sale")
@Data
public class Sale {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column( name = "amount")
    private double amount;
//    private Order order;
    @Column( name = "date")
    private LocalDateTime date;
//    private PaymentEnum paymentEnum;
}
