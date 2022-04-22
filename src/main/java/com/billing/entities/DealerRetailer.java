package com.billing.entities;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "Dealer_Retailer")
public class DealerRetailer extends BaseClass<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long dealer_retailer_id;
	
	@OneToMany(targetEntity = DealerRetailer.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name = "dealer_id")
	private List<Dealer> dealer_id = new ArrayList<>();
	
	@OneToMany(targetEntity = DealerRetailer.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name = "retailer_id")
	private List<Retailer> retailer_id = new ArrayList<>();
	
	@OneToMany(targetEntity = DealerRetailer.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name = "category_id")
	private List<Category> category_id = new ArrayList<>();
	
	@OneToMany(targetEntity = DealerRetailer.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name = "product_id")
	private List<Product>product_id = new ArrayList<>();
	
	
	public List<Product> getProduct_id() {
		return product_id;
	}

	public void setProduct_id(List<Product> product_id) {
		this.product_id = product_id;
	}

	@Column(name ="product_grossamount")
	private Long product_grossamount;
	
	@Column(name ="product_netamount")
	private Long product_netamount;
	
	@Column(name ="product_discount")
	private Long product_discount;
	
	@Column(name ="status")
	private String status;

	public Long getDealer_retailer_id() {
		return dealer_retailer_id;
	}

	public void setDealer_retailer_id(Long dealer_retailer_id) {
		this.dealer_retailer_id = dealer_retailer_id;
	}

	public List<Dealer> getDealer_id() {
		return dealer_id;
	}

	public void setDealer_id(List<Dealer> dealer_id) {
		this.dealer_id = dealer_id;
	}

	public List<Retailer> getRetailer_id() {
		return retailer_id;
	}

	public void setRetailer_id(List<Retailer> retailer_id) {
		this.retailer_id = retailer_id;
	}

	public List<Category> getCategory_id() {
		return category_id;
	}

	public void setCategory_id(List<Category> category_id) {
		this.category_id = category_id;
	}

	public Long getProduct_grossamount() {
		return product_grossamount;
	}

	public void setProduct_grossamount(Long product_grossamount) {
		this.product_grossamount = product_grossamount;
	}

	public Long getProduct_netamount() {
		return product_netamount;
	}

	public void setProduct_netamount(Long product_netamount) {
		this.product_netamount = product_netamount;
	}

	public Long getProduct_discount() {
		return product_discount;
	}

	public void setProduct_discount(Long product_discount) {
		this.product_discount = product_discount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
