package com.example.ao.angolar.tupuca.model.repository;

import com.example.ao.angolar.tupuca.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
