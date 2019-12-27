package com.projetatlas.servicecompte.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompteOperateur  extends Compte {
	

	private String nom;

	public CompteOperateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteOperateur(Long id, Long numeroCompte, double solde, Long idClient, String nom) {
		super(id, numeroCompte, solde, idClient);
		this.nom = nom;
		
		// TODO Auto-generated constructor stub
	}
   	
}
