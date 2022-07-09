package com.billing.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.billing.Services.DealerService;
import com.billing.Services.ProductService;
import com.billing.entities.Dealer;
import com.billing.entities.Product;
import com.billing.modelDTO.DealerModel;

@Controller
public class DealerController {
	
	@Autowired
	private DealerService dealerService;
	
	
	//get all dealer handler
	
	@GetMapping("/dealer/getAlldealer")
	public ResponseEntity<List<DealerModel>> getDealer()
	{
		List<DealerModel>list = dealerService.getAllDealer();
		if(list.size()<= 0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(list));
	}
	
	
	//get single dealer handler
	@GetMapping("/dealer/getByid/{id}")
	public ResponseEntity<Dealer> getDealer(@PathVariable("id")Long id)
	{
		Dealer dealer = dealerService.getDealerByid(id);
		if(dealer==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			
		}
		return ResponseEntity.of(Optional.of(dealer));
	}
	
	//new Dealer handler
	
		@PostMapping("/dealer/adddealer")
		public ResponseEntity<Dealer> addDealer(@RequestBody Dealer dealer)
		{
			Dealer d = null;
			
			try
			{
				d = this.dealerService.addDealer(dealer);
				System.out.println(dealer);
				return ResponseEntity.status(HttpStatus.CREATED).build();
				
			}
			 catch(Exception e)
			{
				 e.printStackTrace();
				 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
			
		}
		
		
		//delete dealer handler
		
		@DeleteMapping("/dealer/deleteByid/{id}")
		public ResponseEntity<Dealer> deleteDealer(@PathVariable("id")Long id)
		{
			try
		  {
			this.dealerService.deleteDealer(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		   }
			catch(Exception e)
			{
			  e.printStackTrace();
			  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
		}
		
		//update Dealer handler
		@PutMapping("/dealer/updateByid/{id}")
		public ResponseEntity<Dealer> updateDealer(@RequestBody Dealer dealer,@PathVariable("id") Long id)
		{
		  try {
			  Dealer List=this.dealerService.updateDealer(dealer, id);
			  return ResponseEntity.status(HttpStatus.OK).body(List);
		  }
		  catch(Exception e){
			  
			  e.printStackTrace();
			  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			  
		  }
		 
		  
		}

}
