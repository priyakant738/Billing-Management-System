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

import com.billing.Services.RetailerService;
import com.billing.entities.Retailer;
import com.billing.entities.State;
import com.billing.modelDTO.RetailerModel;

@Controller
public class RetailerController {
	
	@Autowired
	private RetailerService retailerService;
	
	//get all state handler
	
		@GetMapping("/retailer/getAllretailer")
		public ResponseEntity<List<RetailerModel>> getRetailer()
		{
			List<RetailerModel>list = retailerService.getAllRetailer();
			if(list.size()<= 0)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			
			return ResponseEntity.of(Optional.of(list));
		}
		
		//get single state handler
		
		@GetMapping("/retailer/getByid/{id}")
		public ResponseEntity<Retailer> getRetailer(@PathVariable("id")Long id)
		{
			Retailer retailer = retailerService.getRetailerByid(id);
			if(retailer==null)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			return ResponseEntity.of(Optional.of(retailer));
		}
		
		//new retailer handler
		
		@PostMapping("/retailer/addretailer")
		public ResponseEntity<Retailer> addRetailer(@RequestBody Retailer retailer)
		{
			Retailer r = null;
			
			try
			{
				r = this.retailerService.addRetailer(retailer);
				System.out.println(retailer);
				return ResponseEntity.status(HttpStatus.CREATED).build();
				
			}
			 catch(Exception e)
			{
				 e.printStackTrace();
				 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
			
		}
		
		//delete retailer handler
		
		@DeleteMapping("/retailer/deleteByid/{id}")
		public ResponseEntity<Retailer> deleteRetailer(@PathVariable("id")Long id)
		{
			try
		  {
			this.retailerService.deleteRetailer(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		   }
			catch(Exception e)
			{
			  e.printStackTrace();
			  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
		}
		
		
		//update retailer handler
		@PutMapping("/retailer/updateByid/{id}")
		public ResponseEntity<Retailer> updateState(@RequestBody Retailer retailer,@PathVariable("id") Long id)
		{
		   
		   
		   try
			  {
			   Retailer list = this.retailerService.updateRetailer(retailer, id);
				return ResponseEntity.status(HttpStatus.OK).body(list);
			   }
				catch(Exception e)
				{
				  e.printStackTrace();
				  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
				}
		   
		}

}
