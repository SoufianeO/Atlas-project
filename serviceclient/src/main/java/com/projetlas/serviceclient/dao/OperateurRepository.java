package com.projetlas.serviceclient.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.projetlas.serviceclient.entities.Operateur;
@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface OperateurRepository extends JpaRepository<Operateur, Long> {

}
