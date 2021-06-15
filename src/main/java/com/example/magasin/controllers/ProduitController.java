package com.example.magasin.controllers;

import com.example.magasin.dto.CommandeDto;
import com.example.magasin.dto.ProduitDto;
import com.example.magasin.services.impl.CommandeServiceImpl;
import com.example.magasin.services.impl.ProduitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produits")
@CrossOrigin
public class ProduitController {
    @Autowired
    ProduitServiceImpl service;

    @PostMapping
    public ProduitDto save(@RequestBody ProduitDto produitDto){
        return this.service.save(produitDto);
    }
    @GetMapping
    public List<ProduitDto> findAll(){
        return this.service.findAll();
    }
    @GetMapping("{id}")
    public ProduitDto findById(@PathVariable Long id){
        return this.service.findById(id);
    }
    @PutMapping
    public ProduitDto edit(@RequestBody ProduitDto produitDto){
        return this.service.save(produitDto);
    }
    @DeleteMapping({"id"})
    public void DeleteById(@PathVariable Long id){
        this.service.deleteById(id);
    }
}
