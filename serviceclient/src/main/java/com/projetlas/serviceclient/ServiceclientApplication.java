package com.projetlas.serviceclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projetlas.serviceclient.dao.ClientRepository;
import com.projetlas.serviceclient.dao.OperateurRepository;
import com.projetlas.serviceclient.entities.Client;
import com.projetlas.serviceclient.entities.Operateur;

@SpringBootApplication
public class ServiceclientApplication implements CommandLineRunner{
	@Autowired
	private ClientRepository  clientRepository;
	@Autowired
	private OperateurRepository operateurRepository;
	
	

	public static void main(String[] args) {
		SpringApplication.run(ServiceclientApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		clientRepository.save(new Client((long)1, "john.doe", "123456", "Marakech", "Doe","John"));
	    //operateurRepository.save(new Operateur((long)2, "inwi", "123456","Admin", "123456"));
		
	}

}
