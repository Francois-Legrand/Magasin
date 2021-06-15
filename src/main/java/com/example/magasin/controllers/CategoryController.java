package com.example.magasin.controllers;

import com.example.magasin.dto.CategoryDto;
import com.example.magasin.models.Categories;
import com.example.magasin.services.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("categories")
public class CategoryController {
    @Autowired
    private CategoryServiceImpl service;

    @PostMapping
    public CategoryDto save(@RequestBody CategoryDto categoryDto){
        return this.service.save(categoryDto);
    }

}
