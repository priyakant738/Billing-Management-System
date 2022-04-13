package com.billing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.billing.Services.DealerService;
import com.billing.entities.Dealer;

@Controller
@RequestMapping("/dealer")
public class DealerController {
			
	@Autowired
	private DealerService dealerService;
	

		
		@GetMapping("/addDealer")
		public ResponseEntity<Dealer> addDealer(Dealer dealer){
			
			try {
				Dealer add = dealerService.addDealer(dealer);
				return ResponseEntity.status(HttpStatus.ACCEPTED).body(add);
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println(e);
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
			
		}

		
		// Get Dealer Details by Id
		@GetMapping("/getDealer")
		public ResponseEntity<Dealer> getDealer(Long id){
			
			try {
				Dealer dealerByid = dealerService.getDealerByid(id);
				return ResponseEntity.status(HttpStatus.ACCEPTED).body(dealerByid);
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println(e);
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
			
		}


}
