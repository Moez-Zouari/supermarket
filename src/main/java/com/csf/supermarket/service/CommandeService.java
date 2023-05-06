package com.csf.supermarket.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csf.supermarket.model.Commande;
import com.csf.supermarket.repository.CommandeRepository;

//defining the business logic  
@Service 
public class CommandeService {
	@Autowired  
	CommandeRepository cmdR;  
	//getting all Commandes record by using the method findaAll() of CrudRepository  

	//getting all Commandes record by using the method findaAll() of CrudRepository  
	public List<Commande> getAllCommandes()   
	{  
		List<Commande> Commandes = new ArrayList<Commande>();  
		cmdR.findAll().forEach(a -> Commandes.add(a));  
		return Commandes;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Commande getCommandesById(long id)   
	{  
		return cmdR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Commande Commandes)   
	{  
		cmdR.save(Commandes);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(long id)   
	{  
		cmdR.deleteById(id);  
	} 
}
