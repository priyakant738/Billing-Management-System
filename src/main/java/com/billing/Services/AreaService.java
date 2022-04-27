package com.billing.Services;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.Repository.AreaRepository;
import com.billing.Repository.CityRepository;
import com.billing.entities.Area;
import com.billing.entities.City;


@Service
public class AreaService {
	
	@Autowired
	private AreaRepository areaRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	public List<Area> getAllArea()
	{
		List<Area> list=(List<Area>)this.areaRepository.findAll();
		return list;
		
	}
	
	
	//Adding the Area
	
	public Area addArea(Map<String,Object> mp)
	{
		Area result=null;
		try {
			Long areaCode =  Long.parseLong((String) mp.get("area_code"));
			String areaName = (String) mp.get("area_name");
			
			Long cityId=Long.parseLong((String) mp.get("city_id"));
			Long areaId =  Long.parseLong((String) mp.get("area_id"));
			Optional<City> city = cityRepository.findById(cityId);
			
			Area area = new Area();
			
			area.setArea_code(areaCode);
			area.setArea_name(areaName);
			area.setCity_id(city.get());
			
			 result=areaRepository.save(area);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	   
		return result;
				
	}
	
	//get the single Area by id
	
			public Area getAreaByid(Long id)
			{
				
				Area area=null;
				try 
				{
					 area = this.areaRepository.find(id);
					 
					
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				return area;
				
			}
			
			
			
			//delete area
			
			public void deleteArea(Long aid)
			{
				areaRepository.deleteById(aid);
			}
			
			//update the area
			
			public Area updateArea(Area area, Long id)
			{
				
				Area list = areaRepository.getById(id);
				list.setCity_id(area.getCity_id());
				list.setArea_code(area.getArea_code());
				list.setArea_name(area.getArea_name());
				return list;
			}

}
