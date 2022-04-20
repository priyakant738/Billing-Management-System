package com.billing.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.Repository.AreaRepository;
import com.billing.entities.Area;


@Service
public class AreaService {
	@Autowired
	private AreaRepository areaRepository;
	
	public List<Area> getAllState()
	{
		List<Area> list=(List<Area>)this.areaRepository.findAll();
		return list;
		
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
			
			//Adding the Area
			
			public Area addArea(Area a)
			{
				Area result=areaRepository.save(a);
				return result;
				
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
