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

import com.csf.supermarket.model.Category;
import com.csf.supermarket.service.CategoryService;





//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")


public class CategoryController {

	//autowire the Categorieservice class  
	@Autowired  
	CategoryService cS;  

	//creating a get mapping that retrieves all the Category detail from the database   
	@GetMapping("/Category")
	private List<Category> getAllCategories()   
	{  
		return cS.getAllCategories();  
	}  

	//creating a get mapping that retrieves the detail of a specific Category  
	@GetMapping("/Category/{id}")  
	private Category getCategory(@PathVariable("id") int id)   
	{  
		return cS.getCategoryById(id);
	}  

	//creating a delete mapping that deletes a specified Category  
	@DeleteMapping("/Category/{id}")  
	private void deleteCategory(@PathVariable("id") int id)   
	{  
		cS.delete(id);  
	} 

	//create new Category
	@PostMapping("/Category")  
	private int saveCategory(@RequestBody Category c)   
	{  
		cS.saveOrUpdate(c);  
		return c.getId();  
	} 

	//creating put mapping that updates the Category detail
	@PutMapping("/Category")  
	private Category update(@RequestBody  Category c)   
	{  
		cS.saveOrUpdate(c);  
		return c;  
	}  
}
