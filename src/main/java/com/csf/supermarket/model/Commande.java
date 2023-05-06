package com.csf.supermarket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;


import org.hibernate.annotations.CreationTimestamp;

@Entity  
@Table  
public class Commande {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    

    @Column(name = "command_date")
    @CreationTimestamp
    private Date commandDate;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getCommandDate() {
		return commandDate;
	}


	public void setCommandDate(Date commandDate) {
		this.commandDate = commandDate;
	}


	@Override
	public String toString() {
		return "Commande [id=" + id + ", commandDate=" + commandDate + "]";
	}




}
