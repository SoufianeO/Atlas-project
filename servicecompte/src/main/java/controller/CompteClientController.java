package controller;

import com.projetatlas.servicecompte.entities.CompteClient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetatlas.servicecompte.dao.CompteClientRepository;

@CrossOrigin
@RestController
@RequestMapping("/SERVICECOMPTE")
public class CompteClientController {
	
	@Autowired
	CompteClientRepository compteclientrepository;
	
	 @GetMapping("/compteClients")
	    public List<CompteClient> getAllCompteClients(){
	        return compteclientrepository.findAll();
	    }

}
