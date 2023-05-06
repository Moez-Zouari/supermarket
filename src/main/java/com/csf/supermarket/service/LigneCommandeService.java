package com.csf.supermarket.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csf.supermarket.model.LigneCommande;
import com.csf.supermarket.repository.LigneCommandeRepository;

//defining the business logic  
@Service 
public class LigneCommandeService {

	@Autowired  
	LigneCommandeRepository lcmdR;  
	//getting all LigneCommandes record by using the method findaAll() of CrudRepository  

	//getting all LigneCommandes record by using the method findaAll() of CrudRepository  
	public List<LigneCommande> getAllCommandes()   
	{  
		List<LigneCommande> LigneCommandes = new ArrayList<LigneCommande>();  
		lcmdR.findAll().forEach(a -> LigneCommandes.add(a));  
		return LigneCommandes;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public LigneCommande getLigneCommandeById(long id)   
	{  
		return lcmdR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(LigneCommande LigneCommandes)   
	{  
		lcmdR.save(LigneCommandes);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(long id)   
	{  
		lcmdR.deleteById(id);  
	} 
}
