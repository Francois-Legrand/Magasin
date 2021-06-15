package com.example.magasin.services.impl;

import com.example.magasin.dto.CategoryDto;
import com.example.magasin.models.Categories;
import com.example.magasin.repositories.CategoryRepository;
import com.example.magasin.services.ICategoryService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public Optional<CategoryDto> findById(Long id) {
        //Optional<Categories> category = this.repository.findAllById(id);

    }

    @Override
    public CategoryDto save(CategoryDto categoryDto) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
