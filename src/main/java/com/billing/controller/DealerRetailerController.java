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
import com.billing.Services.DealerRetailerService;
import com.billing.entities.DealerRetailer;

@Controller
public class DealerRetailerController {
	
	@Autowired
	private DealerRetailerService dealerRetailerSevice;
	

	@GetMapping("/Dealerretailer")
	public ResponseEntity<List<DealerRetailer>> getDealerRetailer()
	{
		List<DealerRetailer>list = dealerRetailerSevice.getAllDealerRetailer();
		if(list.size()<= 0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(list));
	}
	
	//get single DealerRetailer handler
	
	@GetMapping("/Dealerretailer/{id}")
	public ResponseEntity<DealerRetailer> getDealerRetailer(@PathVariable("id")Long id)
	{
		DealerRetailer dealerRetailer = dealerRetailerSevice.getDealerRetailerByid(id);
		if(dealerRetailer==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(dealerRetailer));
	}
	
	//new DealerRetailer handler
	
	@PostMapping("/Dealerretailer/addDealerretailer")
	public ResponseEntity<DealerRetailer> addDealerRetailer(@RequestBody DealerRetailer dealerRetailer)
	{
		DealerRetailer d = null;
		
		try
		{
			d = this.dealerRetailerSevice.addDealerRetailer(dealerRetailer);
			System.out.println(dealerRetailer);
			return ResponseEntity.status(HttpStatus.CREATED).build();
			
		}
		 catch(Exception e)
		{
			 e.printStackTrace();
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	

	//delete DealerRetailer handler
	
	@DeleteMapping("/Dealerretailer/{id}")
	public ResponseEntity<DealerRetailer> deleteDealerRetailer(@PathVariable("id")Long id)
	{
		try
	  {
			
		this.dealerRetailerSevice.deleteDealerRetailer(id);
		return ResponseEntity.status(HttpStatus.OK).build();
	   }
		catch(Exception e)
		{
		  e.printStackTrace();
		  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	//update DealerRetailer handler
	@PutMapping("/agency/{id}")
	public DealerRetailer updateDealerRetailer(@RequestBody DealerRetailer dealerRetailer,@PathVariable("id") Long id)
	{
		this.dealerRetailerSevice.updateDealerRetailer(dealerRetailer, id);
		   return dealerRetailer;
	}
	

}
