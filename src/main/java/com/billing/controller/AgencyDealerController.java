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
import com.billing.Services.AgencyDealerService;
import com.billing.entities.AgencyDealer;
import com.billing.entities.State;
import com.billing.modelDTO.AgencyDealerModel;



@Controller
public class AgencyDealerController {
	
	@Autowired
	private AgencyDealerService agencyDealerSevice;
	
	
	//get all AgencyDealer handler
	
		@GetMapping("/agencydealer/getAllagencydealer")
		public ResponseEntity<List<AgencyDealerModel>> getAgencyDealer()
		{
			List<AgencyDealerModel>list = agencyDealerSevice.getAllAgencyDealer();
			if(list.size()<= 0)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			
			return ResponseEntity.of(Optional.of(list));
		}
		
		//get single AgencyDealer handler
		
		@GetMapping("/agencydealer/getByid/{id}")
		public ResponseEntity<AgencyDealer> getAgencyDealer(@PathVariable("id")Long id)
		{
			AgencyDealer agencyDealer = agencyDealerSevice.getAgencyDealerByid(id);
			if(agencyDealer==null)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			return ResponseEntity.of(Optional.of(agencyDealer));
		}
	
		//new AgencyDealer handler
		
		@PostMapping("/agencydealer/addagencydealer")
		public ResponseEntity<AgencyDealer> addAgencyDealer(@RequestBody AgencyDealer agencyDealer)
		{
			AgencyDealer a = null;
			
			try
			{
				a = this.agencyDealerSevice.addAgencyDealer(agencyDealer);
				System.out.println(agencyDealer);
				return ResponseEntity.status(HttpStatus.CREATED).build();
				
			}
			 catch(Exception e)
			{
				 e.printStackTrace();
				 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
			
		}
		
		//delete AgencyDealer handler
		
		@DeleteMapping("/agencydealer/deleteByid/{id}")
		public ResponseEntity<AgencyDealer> deleteState(@PathVariable("id")Long id)
		{
			try
		  {
			this.agencyDealerSevice.deleteAgencyDealer(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		   }
			catch(Exception e)
			{
			  e.printStackTrace();
			  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
		}
		
		//update state handler
		@PutMapping("/agencydealer/updateByid/{id}")
		public ResponseEntity<AgencyDealer> updateAgencyDealer(@RequestBody AgencyDealer agencyDealer,@PathVariable("id") Long id)
		{
		   
		   
		   try
			  {
			    AgencyDealer list = this.agencyDealerSevice.updateAgencyDealer(agencyDealer, id);
				return ResponseEntity.status(HttpStatus.OK).body(list);
			   }
				catch(Exception e)
				{
				  e.printStackTrace();
				  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
				}
		   
		}
		
	
	

}
