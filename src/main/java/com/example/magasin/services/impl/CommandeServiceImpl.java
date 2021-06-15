package com.example.magasin.services.impl;

import com.example.magasin.dto.CommandeDto;
import com.example.magasin.models.Commandes;
import com.example.magasin.repositories.CommandeRepository;
import com.example.magasin.services.ICommandeService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class CommandeServiceImpl implements ICommandeService {
    private final CommandeRepository repository;
    private ObjectMapper mapper;

    public CommandeServiceImpl(CommandeRepository repository, ObjectMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<CommandeDto> findAll() {
        List<Commandes> commandes = this.repository.findAll();
        List<CommandeDto> commandesDto = new ArrayList<>();
        commandes.forEach(commande ->{
            commandesDto.add(
                    this.mapper.convertValue(commande, CommandeDto.class)
            );
        });

        return commandesDto;
    }

    @Override
    public CommandeDto findById(Long id) {
        return mapper.convertValue(this.repository.findById(id).get(), CommandeDto.class);
    }

    @Override
    public CommandeDto save(CommandeDto commandeDto) {
        Commandes commande = mapper.convertValue(commandeDto, Commandes.class);
        return mapper.convertValue(this.repository.save(commande), CommandeDto.class);
    }

    @Override
    public void deleteById(Long id) {
        this.repository.deleteById(id);
    }
}
