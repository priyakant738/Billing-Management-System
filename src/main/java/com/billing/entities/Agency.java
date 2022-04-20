package com.billing.entities;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Agency")
public class Agency  extends BaseClass<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long agency_id;
	
	@Column(name ="agency_name")
	private String agency_name;
	
	@Column(name ="owner_first_name")
	private String owner_first_name;
	
	@Column(name ="owner_last_name")
	private String owner_last_name;
	
	@Column(name ="agency_address")
	private String agency_address;
	
	@Column(name ="agency_pincode")
	private String agency_pincode;
	
//	 @OneToMany(targetEntity = Product.class)
//	    @JoinColumn(name = "agency_id")
//	    private List<Product> product;
	
	
	@OneToMany(targetEntity = Agency.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name = "state_id")
	private List<State> state_id = new ArrayList<>();
	
	@OneToMany(targetEntity = Agency.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name = "city_id")
	private List<City> city_id = new ArrayList<>();
	
	private String pancard;
	private String gstin_number;
	public Long getAgency_id() {
		return agency_id;
	}
	public void setAgency_id(Long agency_id) {
		this.agency_id = agency_id;
	}
	public String getAgency_name() {
		return agency_name;
	}
	public void setAgency_name(String agency_name) {
		this.agency_name = agency_name;
	}
	public String getOwner_first_name() {
		return owner_first_name;
	}
	public void setOwner_first_name(String owner_first_name) {
		this.owner_first_name = owner_first_name;
	}
	public String getOwner_last_name() {
		return owner_last_name;
	}
	public void setOwner_last_name(String owner_last_name) {
		this.owner_last_name = owner_last_name;
	}
	public String getAgency_address() {
		return agency_address;
	}
	public void setAgency_address(String agency_address) {
		this.agency_address = agency_address;
	}
	public String getAgency_pincode() {
		return agency_pincode;
	}
	public void setAgency_pincode(String agency_pincode) {
		this.agency_pincode = agency_pincode;
	}
	public List<State> getState_id() {
		return state_id;
	}
	public void setState_id(List<State> state_id) {
		this.state_id = state_id;
	}
	public List<City> getCity_id() {
		return city_id;
	}
	public void setCity_id(List<City> city_id) {
		this.city_id = city_id;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public String getGstin_number() {
		return gstin_number;
	}
	public void setGstin_number(String gstin_number) {
		this.gstin_number = gstin_number;
	}
	
	
	
	
	
	
}