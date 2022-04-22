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

	
	@Column(name ="gross_amount")
	private Long gross_amount;
	
	@Column(name ="discount_amount")
	private Long discount_amount;
	
	@Column(name= "net_amount")
	private Long net_amount;
	
	@Column(name ="order_number")
	private Long order_number;
	
	@Column(name ="order_date")
	private String order_date;
	
	@Column(name ="order_status")
	private String order_status;
	
	@Column(name ="order_types")
	private String order_type;
	
	@Column(name ="order_dueDate")
	private String order_duedate;
	
	@Column(name ="payment_type")
	private String payment_type;
	
	@Column(name ="payment_date")
	private String payment_date;
	
	@Column(name ="payment_id")
	private Long payment_id;
	
	@Column(name ="payment_mode")
	private String payment_mode;
	
	@Column(name ="payment_status")
	private String payment_status;

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

	public Long getGross_amount() {
		return gross_amount;
	}

	public void setGross_amount(Long gross_amount) {
		this.gross_amount = gross_amount;
	}

	public Long getDiscount_amount() {
		return discount_amount;
	}

	public void setDiscount_amount(Long discount_amount) {
		this.discount_amount = discount_amount;
	}

	public Long getNet_amount() {
		return net_amount;
	}

	public void setNet_amount(Long net_amount) {
		this.net_amount = net_amount;
	}

	public Long getOrder_number() {
		return order_number;
	}

	public void setOrder_number(Long order_number) {
		this.order_number = order_number;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public String getOrder_type() {
		return order_type;
	}

	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}

	public String getOrder_duedate() {
		return order_duedate;
	}

	public void setOrder_duedate(String order_duedate) {
		this.order_duedate = order_duedate;
	}

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public String getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(String payment_date) {
		this.payment_date = payment_date;
	}

	public Long getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(Long payment_id) {
		this.payment_id = payment_id;
	}

	public String getPayment_mode() {
		return payment_mode;
	}

	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}

	public String getPayment_status() {
		return payment_status;
	}

	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
	
	
	
}
