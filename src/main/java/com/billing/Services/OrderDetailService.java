package com.billing.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.billing.Repository.OrderDetailRepository;
import com.billing.entities.DealerRetailer;
import com.billing.entities.Order;
import com.billing.entities.OrderDetail;

@Service
public class OrderDetailService {
	
	@Autowired
	private OrderDetailRepository orderDetailRepository;
	
	//Get All OrderDetails handler

	public List<OrderDetail> getAllOrderDetail()
	{
		List<OrderDetail>list=orderDetailRepository.findAll();
		return list;
	}
	
	//get the single OrderDetail by id
	
	public OrderDetail getOrderDetailByid(Long id)
	{
		
		OrderDetail orderDetail=null;
		try 
		{
			orderDetail = this.orderDetailRepository.getById(id);
			 
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return orderDetail;
		
	}
	
	
	public OrderDetail addOrderDetail(OrderDetail o)
	{
		List<Long> list = orderamount(o.getProductGrossamount());
	
		o.setProductDiscount(list.get(0));
		o.setProductNetamount(list.get(1));
		
		
		
		OrderDetail result=orderDetailRepository.save(o);
		return result;
		
	}
	
	//delete OrderDetail
	public OrderDetail deleteOrderDetail(Long oid)
	{
		OrderDetail  list= orderDetailRepository.getById(oid);
		orderDetailRepository.deleteById(oid);
		
		return list;
	}
	
	
	//update OrderDetails
	
	public OrderDetail updateOrderDetail(OrderDetail OrderDetail, Long id)
	{
		OrderDetail list= orderDetailRepository.getById(id);
		
		list.setProductId(OrderDetail.getProductId());
		list.setProductQty(OrderDetail.getProductQty());
		list.setProductAmount(OrderDetail.getProductAmount());
		list.setProductGrossamount(OrderDetail.getProductGrossamount());
		list.setProductDiscount(OrderDetail.getProductDiscount());
		list.setProductNetamount(OrderDetail.getProductNetamount());
	
		orderDetailRepository.save(list);
		
		return list;
	}
	
	public List<Long> orderamount (Long productGrossamount)
	{
		Long d=0L;
	  List<Long> list = new ArrayList<>();
	  
	 if (productGrossamount <= 10000) {
         d = 10L;
         list.add(0,d);
	 }
     else if (productGrossamount <= 20000) {
         d = 15L;
         list.add(0,d);
     }
     else {
         d = 20L;
         list.add(0,d);
     }
         
     Long productDiscount = (long) (productGrossamount * d / 100.0);
     Long finalAmt = productGrossamount - productDiscount;
	 list.add(1,finalAmt);
     return list;
	}
	
	
	
}
