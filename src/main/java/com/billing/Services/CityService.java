package com.billing.Services;

import java.util.List;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.Repository.CityRepository;
import com.billing.Repository.StateRepository;
import com.billing.entities.City;
import com.billing.entities.State;


@Service
public class CityService {
	
	@Autowired
	private CityRepository cityRepository;

	@Autowired
	private StateRepository stateRepository;
	
	
	//Adding the city
	
	public City addCity(Map<String,Object> mp)
	{
		City result=null;
		try {
			Long cityCode =  Long.parseLong((String) mp.get("city_code"));
			String cityName = (String) mp.get("city_name");
			
			Long stateId =  Long.parseLong((String) mp.get("state_id"));
			Optional<State> state = stateRepository.findById(stateId);
			
			City city = new City();
			
			city.setCity_code(cityCode);
			city.setCity_name(cityName);
			city.setState_id(state.get());
			
			 result=cityRepository.save(city);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	   
		return result;
				
	}
			

	
	public List<City> getAllCity()
	{
		List<City> list=(List<City>)this.cityRepository.findAll();
		return list;
		
	}
	
	//get the single City by id
	
		public City getCityByid(Long id)
		{
			
			City city=null;
			try 
			{
				 city = this.cityRepository.find(id);
				 
				
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
					list.setState_id(city.getState_id());
					list.setCity_code(city.getCity_code());
					list.setCity_name(city.getCity_name());
										
					cityRepository.save(list);
					
					return list;
				}
}
