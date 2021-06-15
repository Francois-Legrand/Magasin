package com.example.magasin.repositories;

import com.example.magasin.models.Commandes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commandes, Long> {
}
