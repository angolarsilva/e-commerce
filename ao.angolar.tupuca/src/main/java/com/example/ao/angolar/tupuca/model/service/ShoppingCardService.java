package com.example.ao.angolar.tupuca.model.service;

import com.example.ao.angolar.tupuca.model.entity.Customer;
import com.example.ao.angolar.tupuca.model.entity.Product;
import com.example.ao.angolar.tupuca.model.entity.ShoppingCart;

public interface ShoppingCardService {

    ShoppingCart addItemToCart( Product product, int quantity, Customer customer );

    ShoppingCart updateItemInCart( Product product, int quantity, Customer customer );

    ShoppingCart deleteItemFromCart( Product product, Customer customer );
}
