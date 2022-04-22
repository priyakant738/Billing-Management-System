package com.billing.controller;

import java.util.List;
import java.util.Optional;

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

import com.billing.Services.AreaService;
import com.billing.entities.Area;

@Controller
public class AreaController {
	
	@Autowired
	private AreaService areaService;
	
	//get All Area handler
	
	@GetMapping("/area")
	public ResponseEntity<List<Area>> getArea()
	{
		List<Area>list = areaService.getAllArea();
		if(list.size()<= 0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(list));
	}
	

	//get single Area handler
	
		@GetMapping("/area/{id}")
		public ResponseEntity<Area> getArea(@PathVariable("id")Long id)
		{
			Area area = areaService.getAreaByid(id);
			if(area==null)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			return ResponseEntity.of(Optional.of(area));
		}
		
		//new Area handler
		
		@PostMapping("/area/addarea")
		public ResponseEntity<Area> addArea(@RequestBody Area area)
		{
			Area a = null;
			
			try
			{
				a = this.areaService.addArea(area);
				System.out.println(area);
				return ResponseEntity.status(HttpStatus.CREATED).build();
				
			}
			 catch(Exception e)
			{
				 e.printStackTrace();
				 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
			
		}
		
		//delete Area handler
		
		@DeleteMapping("/area/{id}")
		public ResponseEntity<Object> deleteArea(@PathVariable("id")Long id)
		{
			try
		  {
			this.areaService.deleteArea(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		   }
			catch(Exception e)
			{
			  e.printStackTrace();
			  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
		}
		
		//update Area handler
		@PutMapping("/area/{id}")
		public ResponseEntity<Area> updateArea(@RequestBody Area area,@PathVariable("id") Long id)
		{
		   try
		   {
			  Area list= this.areaService.updateArea(area, id);
			  return ResponseEntity.status(HttpStatus.OK).body(list);
		   }
		   catch(Exception e)
		   {
			   e.printStackTrace();
				  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		   }
		   
		}

}
