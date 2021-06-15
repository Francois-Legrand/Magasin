package com.example.magasin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProduitDto {
    private Long id;
    private String nom;
    private int prix;
    private CategoryDto categories;

}
