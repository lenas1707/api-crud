package com.desafioapicrud.apicrud.repositories;

import com.desafioapicrud.apicrud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
