package com.example.ao.angolar.tupuca.model.service;

import com.example.ao.angolar.tupuca.dto.CategoryDto;
import com.example.ao.angolar.tupuca.model.entity.Category;

import java.util.List;

public interface CategoryService {

    /*admin*/
    List<Category> findAll();
    Category save(Category category);
    Category getById(Long id);
    Category update(Category category);
    void deleteById(Long id);
    void enabledById(Long id);
    List<Category> findAllByActivated();

    /*Customer*/
    List<CategoryDto> getCategoryAndProduct();
}
