package com.csf.supermarket.model;


import java.sql.Date;

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
public class Devis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private Date date_dev;

    @Column
    private float total_dev;

    @Column
    private float remise;
    
    @Column
    private float total_remise;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate_dev() {
		return date_dev;
	}

	public void setDate_dev(Date date_dev) {
		this.date_dev = date_dev;
	}

	public float getTotal_dev() {
		return total_dev;
	}

	public void setTotal_dev(float total_dev) {
		this.total_dev = total_dev;
	}

	public float getRemise() {
		return remise;
	}

	public void setRemise(float remise) {
		this.remise = remise;
	}

	public float getTotal_remise() {
		return total_remise;
	}

	public void setTotal_remise(float total_remise) {
		this.total_remise = total_remise;
	}

	@Override
	public String toString() {
		return "Devis [id=" + id + ", date_dev=" + date_dev + ", total_dev=" + total_dev + ", remise=" + remise
				+ ", total_remise=" + total_remise + "]";
	}

	  @ManyToOne(optional=false) //champ obligatoire
			@JoinColumn(name="client_id", referencedColumnName="id")
		    private Client client;

    
    
}
