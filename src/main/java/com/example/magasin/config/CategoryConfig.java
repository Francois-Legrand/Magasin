package com.example.magasin.config;

import com.example.magasin.repositories.CategoryRepository;
import com.example.magasin.services.impl.CategoryServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategoryConfig {
    @Bean
    public CategoryServiceImpl categoryService(CategoryRepository categoryRepository, ObjectMapper mapper){
        return new CategoryServiceImpl(categoryRepository, mapper);
    }
}
