package com.billing.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.Repository.AreaRepository;
import com.billing.Repository.CityRepository;
import com.billing.entities.Area;
import com.billing.entities.City;
import com.billing.entities.State;
import com.billing.modelDTO.AreaModel;


@Service
public class AreaService {
	
	@Autowired
	private AreaRepository areaRepository;
	
	//get all area
	
	public List<AreaModel> getAllArea()
	{
		List<Area> list=(List<Area>)this.areaRepository.findAll();
		
		List<AreaModel> list1 = new ArrayList<>();
		
		list.forEach(e->{
			list1.add(new AreaModel(e.getAreaCode(),e.getAreaName(),e.getCityId().getCityName()));
		});
		return list1;
		
	}
	
	
	//Adding the Area
	
	public Area addArea(Area a)
	{
		Area result=areaRepository.save(a);
		return result;
				
	}
	
	//get the single Area by id
	
			public Area getAreaByid(Long id)
			{
				
				Area area=null;
				try 
				{
					 area = this.areaRepository.getById(id);
					 
					
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
				list.setCityId(area.getCityId());
				list.setAreaCode(area.getAreaCode());
				list.setAreaName(area.getAreaName());
				
				areaRepository.save(list);
				return list;
			}

}
