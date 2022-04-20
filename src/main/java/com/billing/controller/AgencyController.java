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
import com.billing.Services.AgencyService;
import com.billing.entities.Agency;

@Controller
public class AgencyController 
{
	@Autowired
	private AgencyService agencyService;
	
	@GetMapping("/agency")
	public ResponseEntity<List<Agency>> getAgency()
	{
		List<Agency>list = agencyService.getAllAgency();
		if(list.size()<= 0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(list));
	}
	
	//get single agency handler
	
			@GetMapping("/agency/{id}")
			public ResponseEntity<Agency> getArea(@PathVariable("id")Long id)
			{
				Agency area = agencyService.getAgencyByid(id);
				if(area==null)
				{
					return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
				}
				return ResponseEntity.of(Optional.of(area));
			}
	
	    
			//new agency handler
			
			@PostMapping("/agency")
			public ResponseEntity<Agency> addAgency(@RequestBody Agency agency)
			{
				Agency aa = null;
				
				try
				{
					aa = this.agencyService.addAgency(agency);
					System.out.println(agency);
					return ResponseEntity.status(HttpStatus.CREATED).build();
					
				}
				 catch(Exception e)
				{
					 e.printStackTrace();
					 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
				}
				
			}
	
			
			//delete agency handler
			
			@DeleteMapping("/agency/{id}")
			public ResponseEntity<Object> deleteAgency(@PathVariable("id")Long id)
			{
				try
			  {
				this.agencyService.deleteAgency(id);
				return ResponseEntity.status(HttpStatus.OK).build();
			   }
				catch(Exception e)
				{
				  e.printStackTrace();
				  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
				}
			}
	
			//update agency handler
			@PutMapping("/agency/{id}")
			public Agency updateAgency(@RequestBody Agency agency,@PathVariable("id") Long id)
			{
				this.agencyService.updateAgency(agency, id);
				   return agency;
			}


	}
