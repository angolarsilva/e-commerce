package com.example.ao.angolar.tupuca.model.service;

import com.example.ao.angolar.tupuca.dao.ContactDao;

import java.util.Optional;

public interface ContactService {

    Optional<ContactDao> create( ContactDao request );
    Optional<ContactDao> update( long id, ContactDao request );
}
