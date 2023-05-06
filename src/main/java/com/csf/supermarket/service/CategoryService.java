package com.csf.supermarket.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.csf.supermarket.model.Category;
import com.csf.supermarket.repository.CategoryRepository;




//defining the business logic  
@Service 
public class CategoryService {

	@Autowired  
	CategoryRepository cR;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Category> getAllCategories()   
	{  
		List<Category> categories = new ArrayList<Category>();  
		cR.findAll().forEach(c -> categories.add(c));  
		return categories;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Category getCategoryById(int id)   
	{  
		return cR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Category categories)   
	{  
		cR.save(categories);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		cR.deleteById(id);  
	} 

}