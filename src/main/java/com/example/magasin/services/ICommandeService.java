package com.example.magasin.services;


import com.example.magasin.dto.CommandeDto;

import java.util.List;
import java.util.Optional;

public interface ICommandeService {
    List<CommandeDto> findAll();
    Optional<CommandeDto> findById(Long id);
    CommandeDto save(CommandeDto commandeDto);
    void deleteById(Long id);
}
