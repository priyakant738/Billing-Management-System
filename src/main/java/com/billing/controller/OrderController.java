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

import com.billing.Services.OrderService;
import com.billing.entities.City;
import com.billing.entities.Order;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	//get all Order handler
	
		@GetMapping("/order")
		public ResponseEntity<List<Order>> getOrder()
		{
			List<Order>list = orderService.getAllOrder();
			if(list.size()<= 0)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			
			return ResponseEntity.of(Optional.of(list));
		}
		
		//get single order handler
		
		@GetMapping("/order/{id}")
		public ResponseEntity<Order> getOrder(@PathVariable("id")Long id)
		{
			Order order = orderService.getOrderByid(id);
			if(order==null)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
				
			}
			return ResponseEntity.of(Optional.of(order));
		}
		
		//new order handler
		
		@PostMapping("/order/addorder")
		public ResponseEntity<Order> addOrder(@RequestBody Order order)
		{
			Order o = null;
			
			try
			{
				o = this.orderService.addOrder(order);
				System.out.println(order);
				return ResponseEntity.status(HttpStatus.CREATED).build();
				
			}
			 catch(Exception e)
			{
				 e.printStackTrace();
				 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
			
		}
		
		//delete Order handler
		
		@DeleteMapping("/order/{id}")
		public ResponseEntity<Order> deleteOrder(@PathVariable("id")Long id)
		{
			try
		  {
			this.orderService.deleteOrder(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		   }
			catch(Exception e)
			{
			  e.printStackTrace();
			  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
		}
		
		//update order handler
		@PutMapping("/order/{id}")
		public ResponseEntity<Order> updateOrder(@RequestBody Order order,@PathVariable("city_id") Long id)
		{
		  try {
			  Order List=this.orderService.updateOrder(order, id);
			  return ResponseEntity.status(HttpStatus.OK).body(List);
		  }
		  catch(Exception e){
			  
			  e.printStackTrace();
			  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			  
		  }
		 
		  
		}

}
