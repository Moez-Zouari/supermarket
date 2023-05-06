package com.csf.supermarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.csf.supermarket.model.Commande;
import com.csf.supermarket.service.CommandeService;


//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class CommandeController {
	
	//autowire the CommandeService class  
	@Autowired  
	CommandeService cS;  

	//creating a get mapping that retrieves all the Commande detail from the database   
	@GetMapping("/Commande")
	private List<Commande> getAllCommandes()   
	{  
		return cS.getAllCommandes();  
	}  

	//creating a get mapping that retrieves the detail of a specific Commande  
	@GetMapping("/Commande/{id}")  
	private Commande getCommande(@PathVariable("id") int id)   
	{  
		return cS.getCommandesById(id);  
	}  

	//creating a delete mapping that deletes a specified Commande  
	@DeleteMapping("/Commande/{id}")  
	private void deleteCommande(@PathVariable("id") int id)   
	{  
		cS.delete(id);  
	} 

	//create new Commande
	@PostMapping("/Commande")  
	private long saveCommande(@RequestBody Commande a)   
	{  
		cS.saveOrUpdate(a);  
		return a.getId();  
	} 

	//creating put mapping that updates the Commande detail
	@PutMapping("/Commande")  
	private Commande update(@RequestBody  Commande a)   
	{  
		cS.saveOrUpdate(a);  
		return a;  
	}  

}
