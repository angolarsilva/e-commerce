package com.example.ao.angolar.tupuca.model.service;

import com.example.ao.angolar.tupuca.dto.CustomerDto;
import com.example.ao.angolar.tupuca.model.entity.Customer;

public interface CustomerService {

    CustomerDto save( CustomerDto dto );

    Customer findByUsername( String username );

    Customer saveInfor( Customer customer );
}
