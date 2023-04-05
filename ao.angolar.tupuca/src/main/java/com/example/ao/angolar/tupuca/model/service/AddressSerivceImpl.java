package com.example.ao.angolar.tupuca.model.service;

import com.example.ao.angolar.tupuca.dao.AddressDao;
import com.example.ao.angolar.tupuca.model.entity.Address;
import com.example.ao.angolar.tupuca.model.repository.AddressRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressSerivceImpl implements AddressService{

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Optional<AddressDao> create(AddressDao request) {

        Address address = modelMapper.map(request, Address.class);
        addressRepository.save(address);

        return Optional.of(modelMapper.map(address, AddressDao.class));
    }

    @Override
    public Optional<AddressDao> update(Long id, AddressDao request) {

        Optional<Address> address = addressRepository.findById(id);

        if ( address.isPresent() ) {
            address.get().setStreet(request.getStreet());
            address.get().setDistrict(request.getDistrict());
            address.get().setCountry(request.getCountry());
            addressRepository.save( address.get() );
            return Optional.of(modelMapper.map(address, AddressDao.class));
        }

        return Optional.empty();
    }
}
