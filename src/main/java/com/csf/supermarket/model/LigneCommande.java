package com.csf.supermarket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity  
@Table  
public class LigneCommande {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "order_number")
	    private Long orderNumber;

	    @Column(name = "order_sum")
	    private Long orderSum;

	    
	    
	    
	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getOrderNumber() {
			return orderNumber;
		}

		public void setOrderNumber(Long orderNumber) {
			this.orderNumber = orderNumber;
		}

		public Long getOrderSum() {
			return orderSum;
		}

		public void setOrderSum(Long orderSum) {
			this.orderSum = orderSum;
		}

		public Article getArticle() {
			return article;
		}

		public void setArticle(Article article) {
			this.article = article;
		}

		public Commande getCommande() {
			return commande;
		}

		public void setCommande(Commande commande) {
			this.commande = commande;
		}
		
		

		@Override
		public String toString() {
			return "LigneCommande [id=" + id + ", orderNumber=" + orderNumber + ", orderSum=" + orderSum + ", article="
					+ article + ", commande=" + commande + "]";
		}



		@OneToOne(optional=false)
	    @JoinColumn(name = "article_id", referencedColumnName="id")
	    private Article article;
	    
	    @ManyToOne(optional=false) //champ obligatoire
		@JoinColumn(name="commande_id", referencedColumnName="id")
	    private Commande commande;

}
