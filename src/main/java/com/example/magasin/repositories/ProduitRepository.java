package com.example.magasin.repositories;

import com.example.magasin.models.Categories;
import com.example.magasin.models.Produits;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produits, Long> {

}
