package com.projetatlas.servicecompte.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompteClient extends Compte {
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String etat;

  
public CompteClient() {
	super();
	// TODO Auto-generated constructor stub
}

public CompteClient(Long id, Long numeroCompte, double solde , String etat, Long idClient){
	super(id, numeroCompte, solde, idClient);
	this.etat = etat;
	// TODO Auto-generated constructor stub
}

public String getEtat() {
	return etat;
}

public void setEtat(String etat) {
	this.etat = etat;
}

   
}
