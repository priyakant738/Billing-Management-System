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
import com.billing.Services.DealerRetailerService;
import com.billing.entities.DealerRetailer;
import com.billing.modelDTO.RetailerInformation;
import com.billing.modelDTO.DealerId1;
//import com.billing.modelDTO.DealerId2;
import com.billing.modelDTO.DealerRetailerModel;

@Controller
public class DealerRetailerController {
	
	@Autowired
	private DealerRetailerService dealerRetailerSevice;
	

	@GetMapping("/dealerretailer/getAlldealerretailer")
	public ResponseEntity<List<DealerRetailerModel>> getDealerRetailer()
	{
		List<DealerRetailerModel>list = dealerRetailerSevice.getAllDealerRetailer();
		if(list.size()<= 0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(list));
	}
	
	//get single DealerRetailer handler
	
	@GetMapping("/dealerretailer/getByid/{id}")
	public ResponseEntity<DealerRetailerModel> getDealerRetailer(@PathVariable("id")Long id)
	{
		DealerRetailerModel dealerRetailer = dealerRetailerSevice.getDealerRetailerByid(id);
		if(dealerRetailer==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(dealerRetailer));
	}
	
	//new DealerRetailer handler
	
	@PostMapping("/dealerretailer/adddealerretailer")
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
	
	@DeleteMapping("/dealerretailer/deleteByid/{id}")
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
	@PutMapping("/dealerretailer/updateByid/{id}")
	public ResponseEntity <DealerRetailer> updateDealerRetailer(@RequestBody DealerRetailer dealerRetailer,@PathVariable("id") Long id)
	{
		try {
			DealerRetailer List = this.dealerRetailerSevice.updateDealerRetailer(dealerRetailer, id);
			return ResponseEntity.status(HttpStatus.OK).body(List);
		  }
		  catch(Exception e){
			  
			  e.printStackTrace();
			  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			  
		  }
	}
	
	
           //get retailer by dealer	
 	
//		@GetMapping("/dealerretailer/getBydealerId/{id}")
//		public ResponseEntity <DealerId1> featchRetailerByDealerId(@PathVariable("id") Long id)
//		{
//			try {
//				DealerId1 List = this.dealerRetailerSevice.featchRetailerByDealerId(id);
//				return ResponseEntity.status(HttpStatus.OK).body(List);
//			  }
//			  catch(Exception e){
//				  
//				  e.printStackTrace();
//				  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//				  
//			  }
//		}
		
//	@GetMapping("/dealerretailer/getBydealer")
//	public ResponseEntity <List<RetailerInformation>> featchRetailerByDealer()
//	{
//		try {
//			List<RetailerInformation> List = this.dealerRetailerSevice.featchRetailerByDealer();
//			return ResponseEntity.status(HttpStatus.OK).body(List);
//		  }
//		  catch(Exception e){
//			  
//			  e.printStackTrace();
//			  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//			  
//		  }
//	}
	
	
//	@GetMapping("/dealerretailer/getBydealerId/")
//	public ResponseEntity <DealerId1> featchRetailerByDealerId()
//	{
//		try {
//			DealerId1 List = this.dealerRetailerSevice.featchRetailerByDealerId();
//			return ResponseEntity.status(HttpStatus.OK).body(List);
//		  }
//		  catch(Exception e){
//			  
//			  e.printStackTrace();
//			  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//			  
//		  }
//	}
	
	
//	// @GetMapping("/dealerretailer/getdealerRetailer")
//	// public ResponseEntity <List<DealerId1>> featchRetailerByDealerId()
//	// {
//	// 	try {
//	// 		List<DealerId1> List = this.dealerRetailerSevice.featchRetailerByDealerId();
//	// 		return ResponseEntity.status(HttpStatus.OK).body(List);
//	// 	  }
//	// 	  catch(Exception e){
//			  
//	// 		  e.printStackTrace();
//	// 		  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//			  
//	// 	  }
//	// }

	@GetMapping("/dealerretailer/getdealerRetailer")
	public ResponseEntity <List<Object>> featchRetailerByDealerId()
	{
		try {
			List<Object> List = this.dealerRetailerSevice.featchRetailerByDealerId();
			return ResponseEntity.status(HttpStatus.OK).body(List);
		  }
		  catch(Exception e){
			  
			  e.printStackTrace();
			  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			  
		  }
	}
	
	
	//c
	
//	       @GetMapping("/dealerretailer/getdealerRetailer")
//		   public ResponseEntity <List<DealerId1>> featchRetailerByDealerId()
//		 {
//		 	try {
//		 		List<DealerId1> List = this.dealerRetailerSevice.featchRetailerByDealerId();
//	    		return ResponseEntity.status(HttpStatus.OK).body(List);
//		 	  }
//		 	  catch(Exception e){
//				  
//		 		  e.printStackTrace();
//		 		  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//				  
//		 	  }
//		 }
	
	
		
}
