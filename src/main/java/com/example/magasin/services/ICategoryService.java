package com.example.magasin.services;

import com.example.magasin.dto.CategoryDto;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    List<CategoryDto> findAll();
    Optional<CategoryDto> findById(Long id);
    CategoryDto save(CategoryDto categoryDto);
    void deleteById(Long id);
}
