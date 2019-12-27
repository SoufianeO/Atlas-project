package com.projetatlas.servicecompte.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.projetatlas.servicecompte.entities.CompteClient;


@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface CompteClientRepository extends JpaRepository<CompteClient,Long> {
	List<CompteClient> findByIdClient(Long idClient);
	
	
}
