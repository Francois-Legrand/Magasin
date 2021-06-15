package com.example.magasin.config;

import com.example.magasin.repositories.CategoryRepository;
import com.example.magasin.repositories.ClientRepository;
import com.example.magasin.repositories.CommandeRepository;
import com.example.magasin.repositories.ProduitRepository;
import com.example.magasin.services.impl.CategoryServiceImpl;
import com.example.magasin.services.impl.ClientServiceImpl;
import com.example.magasin.services.impl.CommandeServiceImpl;
import com.example.magasin.services.impl.ProduitServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public CategoryServiceImpl categoryService(CategoryRepository categoryRepository, ObjectMapper mapper){
        return new CategoryServiceImpl(categoryRepository, mapper);
    }
    @Bean
    public ClientServiceImpl clientService(ClientRepository clientRepository, ObjectMapper mapper){
        return new ClientServiceImpl(clientRepository, mapper);
    }
    @Bean
    public CommandeServiceImpl commandeService(CommandeRepository commandeRepository, ObjectMapper mapper){
        return new CommandeServiceImpl(commandeRepository, mapper);
    }
    @Bean
    public ProduitServiceImpl produitService(ProduitRepository produitRepository, ObjectMapper mapper){
        return new ProduitServiceImpl(produitRepository, mapper);
    }
}
