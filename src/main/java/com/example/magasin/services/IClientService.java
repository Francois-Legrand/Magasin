package com.example.magasin.services;

import com.example.magasin.dto.ClientDto;

import java.util.List;

public interface IClientService {
    List<ClientDto> findAll();
    ClientDto findById(Long id);
    ClientDto save(ClientDto clientDto);
    void deleteById(Long id);
}
