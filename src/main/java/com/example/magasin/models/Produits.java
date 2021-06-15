package com.example.magasin.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "produits")
@Getter
@Setter
public class Produits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private int prix;

    @ManyToOne
    @JoinColumn(name = "categories_id")
    private Categories categories;
    @JsonIgnore
    @ManyToMany(mappedBy = "produits")
    private List<Commandes> commandes;

}
