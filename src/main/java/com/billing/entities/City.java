package com.billing.entities;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "City")
public class City extends BaseClass<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "city_id")
	private Long cityId;
	
	@OneToOne
	@JoinColumn(name="state_id")
	private State stateId;
	
	@Column(name ="city_code")
	private Long cityCode;
	
	@Column(name ="city_name")
	private String cityName;

	public Long getCityId() {
		return cityId;
	}

	public void setCityid(Long cityid) {
		this.cityId = cityid;
	}


	public State getStateId() {
		return stateId;
	}

	public void setStateId(State stateId) {
		this.stateId = stateId;
	}

	public Long getCityCode() {
		return cityCode;
	}

	public void setCityCode(Long cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	

	



	

}
