package com.billing.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Order_Detail")
public class Order_Detail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long order_detail_id;
	
	@OneToMany(targetEntity = Order_Detail.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name = "product_id")
	private List<Product> product_id= new ArrayList<>();
	
	
	@Column(name ="product_qty")
	private Long product_qty;
	
	@Column(name ="product_amount")
	private Long product_amount;
	
	@Column(name ="product_rossamount")
	private Long product_grossamount;
	
	@Column(name ="product_discount")
	private String product_discount;
	
	@Column(name ="product_netamount")
	private Long product_netamount;

	public long getOrder_detail_id() {
		return order_detail_id;
	}

	public void setOrder_detail_id(long order_detail_id) {
		this.order_detail_id = order_detail_id;
	}

	public List<Product> getProduct_id() {
		return product_id;
	}

	public void setProduct_id(List<Product> product_id) {
		this.product_id = product_id;
	}

	public Long getProduct_qty() {
		return product_qty;
	}

	public void setProduct_qty(Long product_qty) {
		this.product_qty = product_qty;
	}

	public Long getProduct_amount() {
		return product_amount;
	}

	public void setProduct_amount(Long product_amount) {
		this.product_amount = product_amount;
	}

	public Long getProduct_grossamount() {
		return product_grossamount;
	}

	public void setProduct_grossamount(Long product_grossamount) {
		this.product_grossamount = product_grossamount;
	}

	public String getProduct_discount() {
		return product_discount;
	}

	public void setProduct_discount(String product_discount) {
		this.product_discount = product_discount;
	}

	public Long getProduct_netamount() {
		return product_netamount;
	}

	public void setProduct_netamount(Long product_netamount) {
		this.product_netamount = product_netamount;
	}
	
	
	

}
