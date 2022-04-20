package com.billing.entities;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "Product")
public class Product extends BaseClass<String>{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long product_id;
	
	
	@OneToOne(targetEntity = Product.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name = "agency_id")
	private Agency agency_id;
	
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="category_id")
	private Category category_id;
	

//	  @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY, mappedBy="product")
//	  private List<Category> category_id = new ArrayList<>();

//	 @OneToMany( mappedBy="product", cascade=CascadeType.ALL,fetch=FetchType.LAZY)
//	 private List<Agency> agency = new ArrayList<>();
	 
//	  @OneToMany(targetEntity = Agency.class)
//	    @JoinColumn(name = "AP_fk",referencedColumnName="product_id")
//	    private List<Agency> agency;
	  
//	  @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	    @JoinColumn(name = "agency_id")
//	    private List<Agency> agency;
	  
	  
//	  @OneToMany
//	  @JoinColumn(name="Agency_id")
//	  private Set<Agency> agency;
//	  
//	  @OneToMany(cascade=CascadeType.ALL)
//	  @JoinColumn(name="fk_product_id", referencedColumnName="product_id")
//	  private Agency agency;
	  
//	  @OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
//	  @JoinColumn(name="product_id")
//	  private List<Agency>agency= new ArrayList<>();
	 
	@Column(name ="Product_Name")
	private String product_name;
	
	@Column(name ="Product_Code")
	private Long product_code;	
	
	@Column(name ="Product_Price")
	private Long product_price;
	
	@Column(name ="Product_Desc")
	private String product_desc;
	
	@Column(name ="Product_Status")
	private String product_status;

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public Agency getAgency_id() {
		return agency_id;
	}

	public void setAgency_id(Agency agency_id) {
		this.agency_id = agency_id;
	}

	public Category getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Category category_id) {
		this.category_id = category_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Long getProduct_code() {
		return product_code;
	}

	public void setProduct_code(Long product_code) {
		this.product_code = product_code;
	}

	public Long getProduct_price() {
		return product_price;
	}

	public void setProduct_price(Long product_price) {
		this.product_price = product_price;
	}

	public String getProduct_desc() {
		return product_desc;
	}

	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}

	public String getProduct_status() {
		return product_status;
	}

	public void setProduct_status(String product_status) {
		this.product_status = product_status;
	}

    
	
	
	
	

}
