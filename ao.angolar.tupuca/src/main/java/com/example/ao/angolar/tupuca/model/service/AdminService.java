package com.example.ao.angolar.tupuca.model.service;

import com.example.ao.angolar.tupuca.dto.AdminDto;
import com.example.ao.angolar.tupuca.model.entity.Admin;

public interface AdminService {

    Admin findByUsername(String username);

    Admin save(AdminDto adminDto);
}
