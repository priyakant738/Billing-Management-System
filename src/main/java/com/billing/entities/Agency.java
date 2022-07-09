package com.billing.entities;

import javax.persistence.*;

@Entity
@Table(name = "Agency")
//     uniqueConstraints={
//    @UniqueConstraint(columnNames = {"agency_Name", "owner_firstname", "owner_Lastname", "agency_Address"})
//	})

public class Agency  extends BaseClass<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="agency_id")
	private Long agencyId;
	
	@Column(name ="agency_Name")
	private String agencyName;
	
	@Column(name ="owner_firstname")
	private String ownerFirstName;
	
	@Column(name ="owner_Lastname")
	private String ownerLastName;
	
	@Column(name ="agency_Address")
	private String agencyAddress;
	
	@Column(name ="agency_Pincode")
	private String agencyPincode;
	
	
	
	@OneToOne
	@JoinColumn(name = "state_id")
	private State stateId;
	
	@OneToOne
	@JoinColumn(name = "city_id")
	private City cityId;
	
	@Column(name ="Pancard")
	private String pancard;
	
	@Column(name ="gstin_Number")
	private String gstinNumber;

	

	public Long getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(Long agencyId) {
		this.agencyId = agencyId;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public String getOwnerFirstName() {
		return ownerFirstName;
	}

	public void setOwnerFirstName(String ownerFirstName) {
		this.ownerFirstName = ownerFirstName;
	}

	public String getOwnerLastname() {
		return ownerLastName;
	}

	public void setOwnerLastname(String ownerLastname) {
		this.ownerLastName = ownerLastname;
	}

	public String getAgencyAddress() {
		return agencyAddress;
	}

	public void setAgencyAddress(String agencyAddress) {
		this.agencyAddress = agencyAddress;
	}

	public String getAgencyPincode() {
		return agencyPincode;
	}

	public void setAgencyPincode(String agencyPincode) {
		this.agencyPincode = agencyPincode;
	}

	

	public String getOwnerLastName() {
		return ownerLastName;
	}

	public void setOwnerLastName(String ownerLastName) {
		this.ownerLastName = ownerLastName;
	}

	public State getStateId() {
		return stateId;
	}

	public void setStateId(State stateId) {
		this.stateId = stateId;
	}

	public City getCityId() {
		return cityId;
	}

	public void setCityId(City cityId) {
		this.cityId = cityId;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public String getGstinNumber() {
		return gstinNumber;
	}

	public void setGstinNumber(String gstinNumber) {
		this.gstinNumber = gstinNumber;
	}
	

	
	
}