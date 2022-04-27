package com.billing.entities;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "Dealer_Retailer")
public class DealerRetailer extends BaseClass<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long dealer_retailer_id;
	
	@OneToOne
	@JoinColumn(name = "dealer_id")
	private Dealer dealer_id;
	
	@OneToOne
	@JoinColumn(name = "retailer_id")
	private Retailer retailer_id;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "category_id")
	private List<Category> category_id;
	
	@OneToMany(cascade=CascadeType.ALL,targetEntity= DealerRetailer.class)
	@JoinColumn(name = "product_id")
	private List<Product>product_id;

	public Long getDealer_retailer_id() {
		return dealer_retailer_id;
	}

	public void setDealer_retailer_id(Long dealer_retailer_id) {
		this.dealer_retailer_id = dealer_retailer_id;
	}

	public Dealer getDealer_id() {
		return dealer_id;
	}

	public void setDealer_id(Dealer dealer_id) {
		this.dealer_id = dealer_id;
	}

	public Retailer getRetailer_id() {
		return retailer_id;
	}

	public void setRetailer_id(Retailer retailer_id) {
		this.retailer_id = retailer_id;
	}

	public List<Category> getCategory_id() {
		return category_id;
	}

	public void setCategory_id(List<Category> category_id) {
		this.category_id = category_id;
	}

	public List<Product> getProduct_id() {
		return product_id;
	}

	public void setProduct_id(List<Product> product_id) {
		this.product_id = product_id;
	}

	
	
	
	
	
	
	

}
