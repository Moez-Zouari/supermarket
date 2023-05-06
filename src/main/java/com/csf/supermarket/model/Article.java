package com.csf.supermarket.model;


import java.math.BigDecimal;



import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import javax.persistence.Table;  
 
@Entity  

@Table  

public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private float tax;

    @Column
    private BigDecimal price;
    
    

    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + ", description=" + description + ", tax=" + tax + ", price="
				+ price + ", unitsInStock=" + unitsInStock + ", category=" + category + "]";
	}



	@Column(name= "units_in_stock")
    private int unitsInStock;
	@ManyToOne(optional=false) //champ obligatoire
	@JoinColumn(name="idcategory", referencedColumnName="id")
	private Category category;


	
	
}