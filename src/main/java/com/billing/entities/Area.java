package com.billing.entities;

import javax.persistence.*;

@Entity
@Table(name = "Area")
public class Area extends BaseClass<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long area_id;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="city_id")
	private City city_id;
	
	@Column(name ="area_Code")
	private Long area_code;
	
	@Column(name ="area_name")
	private String area_name;

	public Long getArea_id() {
		return area_id;
	}

	public void setArea_id(Long area_id) {
		this.area_id = area_id;
	}

	public City getCity_id() {
		return city_id;
	}

	public void setCity_id(City city_id) {
		this.city_id = city_id;
	}

	public Long getArea_code() {
		return area_code;
	}

	public void setArea_code(Long area_code) {
		this.area_code = area_code;
	}

	public String getArea_name() {
		return area_name;
	}

	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}
	
	
	

}
