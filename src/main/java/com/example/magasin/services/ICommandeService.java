package com.example.magasin.services;
import com.example.magasin.dto.CommandeDto;

import java.util.List;

public interface ICommandeService {
    List<CommandeDto> findAll();
    CommandeDto findById(Long id);
    CommandeDto save(CommandeDto commandeDto);
    void deleteById(Long id);
}
