package com.projetlas.serviceclient.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.projetlas.serviceclient.entities.Client;

@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface ClientRepository extends JpaRepository<Client, Long> {
	List<Client> findByIdClient(Long idClient);
}
