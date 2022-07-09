package com.billing.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.billing.Services.CityService;
import com.billing.entities.City;
import com.billing.modelDTO.CityModel;


@Controller
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	
	//get all city handler
	
	@GetMapping("/city/getAllcity")
	public ResponseEntity<List<CityModel>> getCity()
	{
		List<CityModel>list = cityService.getAllCity();
		if(list.size()<= 0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(list));
	}
	
	
	//get single city handler
	@GetMapping("/city/getBycity/{id}")
	public ResponseEntity<City> getCity(@PathVariable("id")Long id)
	{
		City city = cityService.getCityByid(id);
		if(city==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			
		}
		return ResponseEntity.of(Optional.of(city));
	}
	
	//new city handler
	
	
	@PostMapping("/city/addcity")
	public ResponseEntity<City> addCity(@RequestBody City city)
	{
		City c = null;
		
		try
		{
			c = this.cityService.addCity(city);
			System.out.println(city);
			return ResponseEntity.status(HttpStatus.CREATED).build();
			
		}
		 catch(Exception e)
		{
			 e.printStackTrace();
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	
	//delete city handler
	
	@DeleteMapping("/city/deleteByid/{id}")
	public ResponseEntity<Object> deleteCity(@PathVariable("id")Long id)
	{
		try
	  {
		this.cityService.deleteCity(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	   }
		catch(Exception e)
		{
		  e.printStackTrace();
		  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	//update city handler
	@PutMapping("/city/updateByid/{id}")
	public ResponseEntity<City> updateCity(@RequestBody City city,@PathVariable("id") Long id)
	{
	  try {
		  City List=this.cityService.updateCity(city, id);
		  return ResponseEntity.status(HttpStatus.OK).body(List);
	  }
	  catch(Exception e){
		  
		  e.printStackTrace();
		  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		  
	  }
	 
	  
	}

	

}
