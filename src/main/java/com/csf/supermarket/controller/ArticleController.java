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

import com.csf.supermarket.model.Article;
import com.csf.supermarket.service.ArticleService;




//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")


public class ArticleController {

	//autowire the ArticleService class  
	@Autowired  
	ArticleService arS;  

	//creating a get mapping that retrieves all the Article detail from the database   
	@GetMapping("/Article")
	private List<Article> getAllArticles()   
	{  
		return arS.getAllArticles();  
	}  

	//creating a get mapping that retrieves the detail of a specific article  
	@GetMapping("/Article/{id}")  
	private Article getArticle(@PathVariable("id") int id)   
	{  
		return arS.getArticlesById(id);  
	}  

	//creating a delete mapping that deletes a specified article  
	@DeleteMapping("/Article/{id}")  
	private void deleteArticle(@PathVariable("id") int id)   
	{  
		arS.delete(id);  
	} 

	//create new article
	@PostMapping("/Article")  
	private int saveArticle(@RequestBody Article a)   
	{  
		arS.saveOrUpdate(a);  
		return a.getId();  
	} 

	//creating put mapping that updates the article detail
	@PutMapping("/Article")  
	private Article update(@RequestBody  Article a)   
	{  
		arS.saveOrUpdate(a);  
		return a;  
	}  
}