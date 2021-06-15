package com.example.magasin.controllers;

import com.example.magasin.dto.CategoryDto;
import com.example.magasin.services.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categories")
@CrossOrigin
public class CategoryController {
    @Autowired
    private CategoryServiceImpl service;

    @PostMapping
    public CategoryDto save(@RequestBody CategoryDto categoryDto){
        return this.service.save(categoryDto);
    }
    @GetMapping
    public List<CategoryDto> findAll(){
        return this.service.findAll();
    }
    @GetMapping("{id}")
    public CategoryDto findById(@PathVariable Long id){
        return this.service.findById(id);
    }
    @PutMapping
    public CategoryDto edit(@RequestBody CategoryDto categoryDto){
        return this.service.save(categoryDto);
    }
    @DeleteMapping({"id"})
    public void DeleteById(@PathVariable Long id){
        this.service.deleteById(id);
    }
}
