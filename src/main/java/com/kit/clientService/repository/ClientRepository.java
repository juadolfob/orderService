package com.kit.clientService.repository;

import com.kit.clientService.model.dao.ClientDAO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientRepository extends JpaRepository<ClientDAO, UUID> {
}