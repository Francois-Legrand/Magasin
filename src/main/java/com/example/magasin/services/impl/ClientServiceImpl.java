package com.example.magasin.services.impl;

import com.example.magasin.dto.ClientDto;
import com.example.magasin.models.Clients;
import com.example.magasin.repositories.ClientRepository;
import com.example.magasin.services.IClientService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class ClientServiceImpl implements IClientService {
    private final ClientRepository repository;
    private ObjectMapper mapper;

    public ClientServiceImpl(ClientRepository repository, ObjectMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<ClientDto> findAll() {
        List<Clients> clients = this.repository.findAll();
        List<ClientDto> clientsDto = new ArrayList<>();
        clients.forEach(client ->{
            clientsDto.add(
                    this.mapper.convertValue(client, ClientDto.class)
            );
        });

        return clientsDto;
    }

    @Override
    public ClientDto findById(Long id) {
        return mapper.convertValue(this.repository.findById(id).get(), ClientDto.class);
    }

    @Override
    public ClientDto save(ClientDto clientDto) {
        Clients client = mapper.convertValue(clientDto, Clients.class);
        return mapper.convertValue(this.repository.save(client), ClientDto.class);
    }

    @Override
    public void deleteById(Long id) {
        this.repository.deleteById(id);
    }


}
