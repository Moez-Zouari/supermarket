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

import com.csf.supermarket.model.LigneCommande;
import com.csf.supermarket.service.LigneCommandeService;


//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class LigneCommandeController {

	//autowire the LigneCommandeService class  
	@Autowired  
	LigneCommandeService lcmdS;  

	//creating a get mapping that retrieves all the LigneCommande detail from the database   
	@GetMapping("/LigneCommande")
	private List<LigneCommande> getAllLigneCommandes()   
	{  
		return lcmdS.getAllCommandes();  
	}  

	//creating a get mapping that retrieves the detail of a specific LigneCommande  
	@GetMapping("/LigneCommande/{id}")  
	private LigneCommande getLigneCommande(@PathVariable("id") long id)   
	{  
		return lcmdS.getLigneCommandeById(id);  
	}  

	//creating a delete mapping that deletes a specified LigneCommande  
	@DeleteMapping("/LigneCommande/{id}")  
	private void deleteLigneCommande(@PathVariable("id") int id)   
	{  
		lcmdS.delete(id);  
	} 

	//create new LigneCommande
	@PostMapping("/LigneCommande")  
	private long saveLigneCommande(@RequestBody LigneCommande a)   
	{  
		lcmdS.saveOrUpdate(a);  
		return a.getId();  
	} 

	//creating put mapping that updates the LigneCommande detail
	@PutMapping("/LigneCommande")  
	private LigneCommande update(@RequestBody  LigneCommande a)   
	{  
		lcmdS.saveOrUpdate(a);  
		return a;  
	}  

}
