package com.example.ao.angolar.tupuca.model.service;

import com.example.ao.angolar.tupuca.dao.ContactDao;
import com.example.ao.angolar.tupuca.model.entity.Contact;
import com.example.ao.angolar.tupuca.model.repository.ContactRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Optional<ContactDao> create(ContactDao request) {

        Contact contact = modelMapper.map(request, Contact.class);
        contactRepository.save(contact);

        ContactDao contactDao = modelMapper.map(contact, ContactDao.class);

        return Optional.of(contactDao);
    }

    @Override
    public Optional<ContactDao> update(long id, ContactDao request) {

        Optional<Contact> contact = contactRepository.findById(id);

        if ( contact.isEmpty() ) {
            return Optional.empty();
        }

        contact.get().setNumber(request.getNumber());
        contact.get().setAlternative_number(request.getAlternative_number());
        contactRepository.save(contact.get());
        return Optional.of(modelMapper.map(contact, ContactDao.class));
    }
}
