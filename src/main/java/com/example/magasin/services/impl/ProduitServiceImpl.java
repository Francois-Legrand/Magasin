package com.example.magasin.services.impl;

import com.example.magasin.dto.ProduitDto;
import com.example.magasin.models.Clients;
import com.example.magasin.models.Commandes;
import com.example.magasin.models.Produits;
import com.example.magasin.repositories.ProduitRepository;
import com.example.magasin.services.IProduitService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        List<ProduitDto> produitDto = new ArrayList<>();
        produits.forEach(p -> {
          produitDto.add(
                  this.mapper.convertValue(p, ProduitDto.class)
          );
        });
        return produitDto;
    }

    @Override
    public ProduitDto findById(Long id) {
        return mapper.convertValue(this.repository.findById(id).get(), ProduitDto.class);
    }

    @Override
    public ProduitDto save(ProduitDto produitDto) {
        Produits p =  mapper.convertValue(produitDto, Produits.class);
        return mapper.convertValue(this.repository.save(p), ProduitDto.class);
    }

    @Override
    public void deleteById(Long id) {

    }
    public void getAllCommandeFromUser(Long id){
        Produits produit = repository.findById(id).get();

        for (Commandes item:produit.getCommandes()) {
            if(item.getClients().getId() == 1){
                System.out.println(item.getNum());
            }
        }

    }
}
