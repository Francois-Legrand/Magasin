package com.example.magasin.repositories;

import com.example.magasin.models.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Categories, Long> {
}
