package com.example.magasin.services.impl;

import com.example.magasin.dto.ProduitDto;
import com.example.magasin.models.Produits;
import com.example.magasin.repositories.ProduitRepository;
import com.example.magasin.services.IProduitService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class ProduitServiceImpl implements IProduitService {
    private final ProduitRepository repository;
    private ObjectMapper mapper;

    public ProduitServiceImpl(ProduitRepository repository, ObjectMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<ProduitDto> findAll() {
        List<Produits> produits = this.repository.findAll();
        List<ProduitDto> produitsDto = new ArrayList<>();
        produits.forEach(produit ->{
            produitsDto.add(
                    this.mapper.convertValue(produit, ProduitDto.class)
            );
        });

        return produitsDto;
    }

    @Override
    public ProduitDto findById(Long id) {
        return mapper.convertValue(this.repository.findById(id).get(), ProduitDto.class);
    }

    @Override
    public ProduitDto save(ProduitDto produitDto) {
        Produits produit = mapper.convertValue(produitDto, Produits.class);
        return mapper.convertValue(this.repository.save(produit), ProduitDto.class);
    }

    @Override
    public void deleteById(Long id) {
        this.repository.deleteById(id);
    }
}
