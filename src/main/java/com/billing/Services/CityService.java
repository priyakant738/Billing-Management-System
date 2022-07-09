package com.billing.Services;

import java.util.List;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.Repository.CityRepository;
import com.billing.Repository.StateRepository;
import com.billing.entities.City;
import com.billing.entities.State;
import com.billing.modelDTO.CityModel;


@Service
public class CityService {
	
	@Autowired
	private CityRepository cityRepository;
	
	
	//Adding the city
	
	public City addCity(City c)
	{
		City result=cityRepository.save(c);
		return result;
				
	}
			

	//get all city
	
	public List<CityModel> getAllCity()
	{
		List<City> list=(List<City>)this.cityRepository.findAll();
		
		List<CityModel> list1 = new ArrayList<>();
		
		list.forEach(e->{
		list1.add(new CityModel(e.getCityCode(),e.getCityName(),
				e.getStateId().getStateName()));
		});
		
		return list1;
		
	}
	
	//get the single City by id
	
		public City getCityByid(Long id)
		{
			
			City city=null;
			try 
			{
				 city = this.cityRepository.getById(id);
				 
				
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			return city;
			
		}
		
		
		
		 //detele city
		public void deleteCity(Long cid)
		{
			cityRepository.deleteById(cid);
		}
		
		//update the city
		
				public City updateCity(City city, Long id)
				{
					
					City list= cityRepository.getById(id);
					list.setStateId(city.getStateId());
					list.setCityCode(city.getCityCode());
					list.setCityName(city.getCityName());
										
					cityRepository.save(list);
					
					return list;
				}
}
