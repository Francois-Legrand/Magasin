package com.example.magasin.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="produits")
public class Produits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private int prix;

    @ManyToOne
    @JoinColumn(name = "categories_nom")
    private Categories categories;
    @JsonIgnore
    @ManyToMany(mappedBy = "produits")
    private List<Commandes> commandes;

}
