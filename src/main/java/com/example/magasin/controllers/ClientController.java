package com.example.magasin.controllers;

import com.example.magasin.dto.ClientDto;
import com.example.magasin.services.impl.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clients")
@CrossOrigin
public class ClientController {
    @Autowired
    ClientServiceImpl service;

    @PostMapping
    public ClientDto save(@RequestBody ClientDto clientDto){
        return this.service.save(clientDto);
    }
    @GetMapping
    public List<ClientDto> findAll(){
        return this.service.findAll();
    }
    @GetMapping("{id}")
    public ClientDto findById(@PathVariable Long id){
        return this.service.findById(id);
    }
    @PutMapping
    public ClientDto edit(@RequestBody ClientDto clientDto){
        return this.service.save(clientDto);
    }
    @DeleteMapping({"{id}"})
    public void DeleteById(@PathVariable Long id){
        this.service.deleteById(id);
    }

}
