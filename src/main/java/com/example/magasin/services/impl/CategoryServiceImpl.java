package com.example.magasin.services.impl;

import com.example.magasin.dto.CategoryDto;
import com.example.magasin.models.Categories;
import com.example.magasin.repositories.CategoryRepository;
import com.example.magasin.services.ICategoryService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class CategoryServiceImpl implements ICategoryService {
    private final CategoryRepository repository;
    private ObjectMapper mapper;

    public CategoryServiceImpl(CategoryRepository repository, ObjectMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<CategoryDto> findAll() {
        List<Categories> categories = this.repository.findAll();
        List<CategoryDto> categoryDtos = new ArrayList<>();
        categories.forEach(categorie -> {
            categoryDtos.add(
                    this.mapper.convertValue(categorie, CategoryDto.class)
            );
        });
        return categoryDtos;
    }

    @Override
    public CategoryDto findById(Long id) {
        return mapper.convertValue(this.repository.findById(id).get(), CategoryDto.class);
    }

    @Override
    public CategoryDto save(Categories category) {
        return mapper.convertValue(this.repository.save(category), CategoryDto.class);
    }

    @Override
    public void deleteById(Long id) {
        this.repository.deleteById(id);
    }
}
