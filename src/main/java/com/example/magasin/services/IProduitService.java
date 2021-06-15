package com.example.magasin.services;

import com.example.magasin.dto.ProduitDto;

import java.util.List;

public interface IProduitService {
    List<ProduitDto> findAll();
    ProduitDto findById(Long id);
    ProduitDto save(ProduitDto produitDto);
    void deleteById(Long id);
}
