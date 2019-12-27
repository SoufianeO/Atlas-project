package com.projetlas.serviceclient.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "app_client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private String username;

    private String firstName;
    private String password;

    
    private String adress;

    
    private String lastName;

    
   
    public Client() {
		
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client(Long id, String username, String password, String adress, String lastName, String firstname) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.adress = adress;
		this.lastName = lastName;
		this.firstName = firstname;
	}
    

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   

    public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

  
}

