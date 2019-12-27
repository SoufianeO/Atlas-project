package com.projetatlas.servicecompte.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public class Compte implements Serializable {
	 @Id 
	 @GeneratedValue(strategy = GenerationType.TABLE)
	 private Long Id;
	 
	 private Long idClient;

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long Id) {
		this.Id = Id;
	}

	
	public Compte() {
		super();
	}
	public Compte(Long id,Long numeroCompte, double solde, Long idClient) {
		super();
		this.numeroCompte = numeroCompte;
		this.Solde = solde;
		this.idClient = idClient;
		
	}
	public Long getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(Long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public double getSolde() {
		return Solde;
	}
	public void setSolde(double solde) {
		Solde = solde;
	}
	private Long numeroCompte;
	private double Solde;
	


}
