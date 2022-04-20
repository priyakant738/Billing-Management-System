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

import com.billing.Repository.AreaRepository;
import com.billing.entities.Agency_Dealer;
import com.billing.entities.Area;
import com.billing.entities.Product;

@Controller
public class Agency_DealerController {
	
	@Autowired
	private Agency_DealerRepository agency_DealerRepository;
	
	//get all agency_Dealer handler
	
		@GetMapping("/agency_Dealer")
		public ResponseEntity<List<agency_Dealer>> getProduct()
		{
			List<Agency_Dealer>list = agency_DealerService.getAllProduct();
			if(list.size()<= 0)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			
			return ResponseEntity.of(Optional.of(list));
		}
		
		
		//get single agency_Dealer handler
		@GetMapping("/agency_Dealer/{id}")
		public ResponseEntity<Agency_Dealer> getProduct(@PathVariable("id")Long id)
		{
			Agency_Dealer agency_Dealer = agency_DealerService.getAgency_DealerByid(id);
			if(agency_Dealer==null)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
				
			}
			return ResponseEntity.of(Optional.of(agency_Dealer));
		}
		
		//new Agency_Dealer handler
		
		@PostMapping("/agency_Dealer")
		public ResponseEntity<Agency_Dealer> addAgency_Dealer(@RequestBody Agency_Dealer agency_Dealer)
		{
			Agency_Dealer ad = null;
			
			try
			{
				ad = this.agency_DealerService.addCity(agency_Dealer);
				System.out.println(agency_Dealer);
				return ResponseEntity.status(HttpStatus.CREATED).build();
				
			}
			 catch(Exception e)
			{
				 e.printStackTrace();
				 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
			
		}
		
		
		//delete Agency_Dealer handler
		
		@DeleteMapping("/agency_Dealer/{id}")
		public ResponseEntity<Object> deleteAgency_Dealer(@PathVariable("id")Long id)
		{
			try
		  {
			this.agency_DealerService.deleteProduct(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		   }
			catch(Exception e)
			{
			  e.printStackTrace();
			  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
		}
		
	
	

}
