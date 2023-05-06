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

import com.csf.supermarket.model.Client;
import com.csf.supermarket.service.ClientService;



//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")


public class ClientController {

	//autowire the ClientService class  
		@Autowired  
		ClientService clS;  

		//creating a get mapping that retrieves all the Client detail from the database   
		@GetMapping("/Client")
		private List<Client> getAllClients()   
		{  
			return clS.getAllClients();  
		}  

		//creating a get mapping that retrieves the detail of a specific Client  
		@GetMapping("/Client/{id}")  
		private Client getClient(@PathVariable("id") int id)   
		{  
			return clS.getClientsById(id);  
		}  

		//creating a delete mapping that deletes a specified Client  
		@DeleteMapping("/Client/{id}")  
		private void deleteClient(@PathVariable("id") int id)   
		{  
			clS.delete(id);  
		} 

		//create new Client
		@PostMapping("/Client")  
		private int saveClient(@RequestBody Client a)   
		{  
			clS.saveOrUpdate(a);  
			return a.getId();  
		} 

		//creating put mapping that updates the Client detail
		@PutMapping("/Client")  
		private Client update(@RequestBody  Client a)   
		{  
			clS.saveOrUpdate(a);  
			return a;  
		}  
		
}
