package com.example.ao.angolar.tupuca.model.service.impl;

import com.example.ao.angolar.tupuca.dto.CategoryDto;
import com.example.ao.angolar.tupuca.model.entity.Category;
import com.example.ao.angolar.tupuca.model.repository.CategoryRepository;
import com.example.ao.angolar.tupuca.model.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category save(Category category) {

        try {
            Category categorySave = new Category(category.getName());
            return  categoryRepository.save(categorySave);
        } catch (Exception e ) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Category getById(Long id) {
        return categoryRepository.getById(id);
    }

    @Override
    public Category update(Category category) {
        Category categoryUpdate = new Category();
        categoryUpdate.setName(category.getName());
        categoryUpdate.set_deleted(category.is_deleted());
        categoryUpdate.set_activated(category.is_activated());

        return categoryRepository.save(categoryUpdate);
    }

    @Override
    public void deleteById(Long id) {
        Category category = categoryRepository.getById(id);
        category.set_deleted(true);
        category.set_activated(false);

        categoryRepository.save(category);
    }

    @Override
    public void enabledById(Long id) {
        Category category = categoryRepository.getById(id);
        category.set_activated(true);
        category.set_deleted(false);
    }

    @Override
    public List<Category> findAllByActivated() {
        return categoryRepository.findAllByActivated();
    }

    @Override
    public List<CategoryDto> getCategoryAndProduct() {
        return null;
    }
}
