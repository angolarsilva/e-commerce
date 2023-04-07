package com.example.ao.angolar.tupuca.model.repository;

import com.example.ao.angolar.tupuca.dto.CategoryDto;
import com.example.ao.angolar.tupuca.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query("select c from Category c where c.is_activated = true and c.is_deleted = false")
    List<Category> findAllByActivated();

    @Query("select new com.example.ao.angolar.tupuca.dto.CategoryDto(c.id, c.name, count(p.category)) " +
            "from Category c inner join Product p on p.category.id = c.id where c.is_activated = true and c.is_deleted = false group by c.id)")
    List<CategoryDto> getCategoryAndProduct();
}
