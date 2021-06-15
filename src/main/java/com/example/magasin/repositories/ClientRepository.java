package com.example.magasin.repositories;

import com.example.magasin.models.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Clients, Long> {
}
