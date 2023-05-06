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

import com.csf.supermarket.model.Devis;
import com.csf.supermarket.service.DevisService;

//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class DevisController {
	//autowire the DevisService class  
		@Autowired  
		DevisService dS;  

		//creating a get mapping that retrieves all the Devis detail from the database   
		@GetMapping("/Devis")
		private List<Devis> getAllDeviss()   
		{  
			return dS.getAllDevis();  
		}  

		//creating a get mapping that retrieves the detail of a specific Devis  
		@GetMapping("/Devis/{id}")  
		private Devis getDevis(@PathVariable("id") int id)   
		{  
			return dS.getDevisById(id);  
		}  

		//creating a delete mapping that deletes a specified Devis  
		@DeleteMapping("/Devis/{id}")  
		private void deleteDevis(@PathVariable("id") int id)   
		{  
			dS.delete(id);  
		} 

		//create new Devis
		@PostMapping("/Devis")  
		private int saveDevis(@RequestBody Devis a)   
		{  
			dS.saveOrUpdate(a);  
			return a.getId();  
		} 

		//creating put mapping that updates the Devis detail
		@PutMapping("/Devis")  
		private Devis update(@RequestBody  Devis a)   
		{  
			dS.saveOrUpdate(a);  
			return a;  
		}  
}
