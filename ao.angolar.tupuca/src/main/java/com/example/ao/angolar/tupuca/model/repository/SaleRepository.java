package com.example.ao.angolar.tupuca.model.repository;

import com.example.ao.angolar.tupuca.model.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
}
