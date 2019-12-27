package com.projetatlas.servicecompte;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projetatlas.servicecompte.dao.CompteClientRepository;
import com.projetatlas.servicecompte.dao.CompteOperateurRepository;
import com.projetatlas.servicecompte.entities.CompteClient;
import com.projetatlas.servicecompte.entities.CompteOperateur;

@SpringBootApplication
public class ServicecompteApplication implements CommandLineRunner {
	@Autowired
    private CompteClientRepository compteClientRepository;
	@Autowired
    private CompteOperateurRepository compteOperateurRepository;
	public static void main(String[] args) {
		SpringApplication.run(ServicecompteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		compteClientRepository.save(new CompteClient(null,4555555l,4242424,"actif", 1l ));
		//compteOperateurRepository.save(new CompteOperateur(null,4555555l,4242424,1l));
		
	}

}
