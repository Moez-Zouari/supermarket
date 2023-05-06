package com.csf.supermarket.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csf.supermarket.model.Devis;
import com.csf.supermarket.repository.DevisRepository;

//defining the business logic  
@Service 
public class DevisService {
	
	@Autowired  
	DevisRepository dR;  
	//getting all Devis record by using the method findaAll() of CrudRepository  

	//getting all Devis record by using the method findaAll() of CrudRepository  
	public List<Devis> getAllDevis()   
	{  
		List<Devis> Devis = new ArrayList<Devis>();  
		dR.findAll().forEach(a -> Devis.add(a));  
		return Devis;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Devis getDevisById(int id)   
	{  
		return dR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Devis Devis)   
	{  
		dR.save(Devis);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		dR.deleteById(id);  
	} 

}
