package com.example.magasin.services;

import com.example.magasin.dto.ClientDto;

import java.util.List;
import java.util.Optional;

public interface IClientService {
    List<ClientDto> findAll();
    Optional<ClientDto> findById(Long id);
    ClientDto save(ClientDto clientDto);
    void deleteById(Long id);
}
