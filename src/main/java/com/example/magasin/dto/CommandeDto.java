package com.example.magasin.dto;

import com.example.magasin.models.Clients;
import com.example.magasin.models.Produits;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommandeDto {
    private Long id;
    private String num;
    private Clients clients;
    private List<Produits> produits;
}
