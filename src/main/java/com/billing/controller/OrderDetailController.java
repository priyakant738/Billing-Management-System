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

import com.billing.Services.OrderDetailService;
import com.billing.entities.OrderDetail;


@Controller
public class OrderDetailController {
	
	@Autowired
	public OrderDetailService orderDetailService;
	
	//Get All OrderDetails handler
	
	@GetMapping("/orderdetail/getAllorderdetail")
	public ResponseEntity<List<OrderDetail>> getOrderDetail()
	{
		List<OrderDetail>list = orderDetailService.getAllOrderDetail();
		if(list.size()<= 0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(list));
	}

	//get single DealerRetailer handler
	
		@GetMapping("/orderdetail/getByid/{id}")
		public ResponseEntity<OrderDetail> getOrderDetail(@PathVariable("id")Long id)
		{
			OrderDetail orderDetail = orderDetailService.getOrderDetailByid(id);
			if(orderDetail==null)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			return ResponseEntity.of(Optional.of(orderDetail));
		}
		
		//new OrderDetail handler
		
		@PostMapping("/orderdetail/addorderdetail")
		public ResponseEntity<OrderDetail> addOrderDetail(@RequestBody OrderDetail orderDetail)
		{
			OrderDetail o = null;
			
			try
			{
				o = this.orderDetailService.addOrderDetail(orderDetail);
				System.out.println(orderDetail);
				return ResponseEntity.status(HttpStatus.CREATED).build();
				
			}
			 catch(Exception e)
			{
				 e.printStackTrace();
				 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
			
		}
		
		//delete OrderDetail handler
		
		@DeleteMapping("/orderdetail/deleteByid/{id}")
		public ResponseEntity<OrderDetail> deleteOrderDetail(@PathVariable("id")Long id)
		{
			try
		  {
				
			this.orderDetailService.deleteOrderDetail(id);
			return ResponseEntity.status(HttpStatus.OK).build();
		   }
			catch(Exception e)
			{
			  e.printStackTrace();
			  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
		}
		
		//update OrderDetail handler
		@PutMapping("/orderdetail/updateByid/{id}")
		public ResponseEntity<OrderDetail> updateOrderDetail(@RequestBody OrderDetail orderDetail,@PathVariable("id") Long id)
		{
			try {
			    OrderDetail List = this.orderDetailService.updateOrderDetail(orderDetail, id);
			    return ResponseEntity.status(HttpStatus.OK).body(List);
			}
			catch(Exception e){
				  
				  e.printStackTrace();
				  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
				  
			  }
		
		}
}
