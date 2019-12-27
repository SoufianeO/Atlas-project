package com.projetatlas.servicecompte.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.projetatlas.servicecompte.entities.CompteOperateur;

@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface CompteOperateurRepository extends JpaRepository<CompteOperateur, Long> {
}
