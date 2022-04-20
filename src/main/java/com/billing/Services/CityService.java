package com.billing.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.Repository.CityRepository;
import com.billing.entities.City;
import com.billing.entities.State;

@Service
public class CityService {
	
	@Autowired
	private CityRepository cityRepository;

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
		
		
		//Adding the city
		
		public City addCity(City c)
		{
			City result=cityRepository.save(c);
			return result;
			
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
