package com.example.magasin.services;

import com.example.magasin.dto.CategoryDto;
import com.example.magasin.models.Categories;

import java.util.List;

public interface ICategoryService {
    List<CategoryDto> findAll();
    CategoryDto findById(Long id);
    CategoryDto save(Categories category);
    void deleteById(Long id);
}
