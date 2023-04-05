package com.example.ao.angolar.tupuca.model.service;

import com.example.ao.angolar.tupuca.dao.AddressDao;

import java.util.Optional;

public interface AddressService {

    Optional<AddressDao> create( AddressDao request );
    Optional<AddressDao> update( Long id, AddressDao request);
}
