package com.csf.supermarket.model;


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
public class Client {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @Column
	    private String firstName;

	    @Column
	    private String lastName;

	    @Column
	    private String address;
	    
	    @Column
	    private String phone;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		@Override
		public String toString() {
			return "Client [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
					+ ", phone=" + phone + "]";
		}

		  @ManyToOne(optional=false) //champ obligatoire
				@JoinColumn(name="commande_id", referencedColumnName="id")
			    private Commande commande;
	    

}
