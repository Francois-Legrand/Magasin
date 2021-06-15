package com.example.magasin.controllers;

import com.example.magasin.dto.ClientDto;
import com.example.magasin.dto.CommandeDto;
import com.example.magasin.services.impl.ClientServiceImpl;
import com.example.magasin.services.impl.CommandeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("commandes")
@CrossOrigin
public class CommandeController {
    @Autowired
    CommandeServiceImpl service;

    @PostMapping
    public CommandeDto save(@RequestBody CommandeDto commandeDto){
        return this.service.save(commandeDto);
    }
    @GetMapping
    public List<CommandeDto> findAll(){
        return this.service.findAll();
    }
    @GetMapping("{id}")
    public CommandeDto findById(@PathVariable Long id){
        return this.service.findById(id);
    }
    @PutMapping
    public CommandeDto edit(@RequestBody CommandeDto commandeDto){
        return this.service.save(commandeDto);
    }
    @DeleteMapping({"id"})
    public void DeleteById(@PathVariable Long id){
        this.service.deleteById(id);
    }
}
