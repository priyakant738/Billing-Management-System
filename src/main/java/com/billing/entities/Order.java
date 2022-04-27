package com.billing.entities;




import javax.persistence.*;

@Entity
@Table(name = "Orders")
public class Order extends BaseClass<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long order_id;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="agency_id")
	private Agency agency_id;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="dealer_id")
	private Dealer dealer_id;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="retailer_id")
	private Retailer retailer_id;

	public Long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}

	public Agency getAgency_id() {
		return agency_id;
	}

	public void setAgency_id(Agency agency_id) {
		this.agency_id = agency_id;
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

	
	
	
	
	
}
