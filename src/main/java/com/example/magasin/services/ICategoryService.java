package com.example.magasin.services;

import com.example.magasin.dto.CategoryDto;

import java.util.List;

public interface ICategoryService {
    List<CategoryDto> findAll();
    CategoryDto findById(Long id);
    CategoryDto save(CategoryDto category);
    void deleteById(Long id);
}
