package com.example.ao.angolar.tupuca.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CollectionId;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "cart_item")
public class CartItem {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "cart_item_id")
    private Long id;
    private int quantity;
    private double totalPrice;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "shopping_cart_id", referencedColumnName = "shopping_card_id")
    private ShoppingCart cart;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn( name = "product_id", referencedColumnName = "product_id")
    private Product product;

}
