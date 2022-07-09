package com.billing.controller;

import java.util.List;
import java.util.Map;
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
import com.billing.modelDTO.AgencyModel;

@Controller
public class AgencyController 
{
	@Autowired
	private AgencyService agencyService;
	
	@GetMapping("/agency/getAllagency")
	public ResponseEntity<List<AgencyModel>> getAgency()
	{
		List<AgencyModel>list = agencyService.getAllAgency();
		if(list.size()<= 0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(list));
	}
	
	//get single agency handler
	
			@GetMapping("/agency/getByid/{id}")
			public ResponseEntity<Agency> getAgency(@PathVariable("id")Long id)
			{
				Agency agency = agencyService.getAgencyByid(id);
				if(agency==null)
				{
					return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
				}
				return ResponseEntity.of(Optional.of(agency));
			}
	
	    
			//new agency handler
			
			@PostMapping("/agency/addagency")
			public ResponseEntity<Agency> addAgency(@RequestBody Agency agency)
			{
				Agency a = null;
				
				try
				{
					a = this.agencyService.addAgency(agency);
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
			
			@DeleteMapping("/agency/deleteByid/{id}")
			public ResponseEntity<Agency> deleteAgency(@PathVariable("id")Long id)
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
			@PutMapping("/agency/updateByid/{id}")
			public ResponseEntity<Agency> updateAgency(@RequestBody Agency agency,@PathVariable("id") Long id)
			{
				try {
				      Agency List = this.agencyService.updateAgency(agency, id);
				      return ResponseEntity.status(HttpStatus.OK).body(List);
			}
				
				 catch(Exception e){
					  
					  e.printStackTrace();
					  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
					  
				  }
				
			}

	}
