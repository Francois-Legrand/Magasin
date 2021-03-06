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
@Table(name="commandes")
public class Commandes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String num;
    @ManyToOne
    @JoinColumn(name = "clients_id")
    private Clients clients;

    @ManyToMany
    @JoinTable(name = "produits_commandes",
            joinColumns = @JoinColumn(name = "commandes_id"),
            inverseJoinColumns = @JoinColumn(name = "produits_id"))
    private List<Produits> produits;

}
