package com.billing.modelDTO;

public class CityModel {
	
	private Long cityCode;
	private String cityName;
	private String stateName;
	
	public CityModel(Long cityCode, String cityName, String stateName) {
		super();
		this.cityCode = cityCode;
		this.cityName = cityName;
		this.stateName = stateName;
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
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	
	
	
	

}
