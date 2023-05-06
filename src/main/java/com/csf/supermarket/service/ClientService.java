package com.csf.supermarket.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csf.supermarket.model.Client;
import com.csf.supermarket.repository.ClientRepository;


//defining the business logic  
@Service 
public class ClientService {
	@Autowired(required = false)
	ClientRepository cR;  
	//getting all Clients record by using the method findaAll() of CrudRepository  

	//getting all Clients record by using the method findaAll() of CrudRepository  
	public List<Client> getAllClients()   
	{  
		List<Client> Clients = new ArrayList<Client>();  
		cR.findAll().forEach(a -> Clients.add(a));  
		return Clients;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Client getClientsById(int id)   
	{  
		return cR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Client Clients)   
	{  
		cR.save(Clients);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		cR.deleteById(id);  
	} 


}
