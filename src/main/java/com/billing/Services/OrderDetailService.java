package com.billing.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.billing.Repository.OrderDetailRepository;
import com.billing.entities.DealerRetailer;
import com.billing.entities.OrderDetail;

@Service
public class OrderDetailService {
	
	@Autowired
	private OrderDetailRepository orderDetailRepository;
	
	public List<OrderDetail> getAllDealerRetailer()
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
	
	//Adding the OrderDetail
	
	public OrderDetail addOrderDetail(OrderDetail o)
	{
		OrderDetail result=orderDetailRepository.save(o);
		return result;
		
	}
	
	//delete OrderDetail
	public OrderDetail deleteState(Long oid)
	{
		OrderDetail  list= orderDetailRepository.getById(oid);
		orderDetailRepository.deleteById(oid);
		
		return list;
	}
	
	//update OrderDetails
	
	public OrderDetail updateOrderDetail(OrderDetail OrderDetail, Long id)
	{
		OrderDetail list= orderDetailRepository.getById(id);
		
		list.setProduct_id(OrderDetail.getProduct_id());
		list.setProduct_qty(OrderDetail.getProduct_qty());
		list.setProduct_amount(OrderDetail.getProduct_amount());
		list.setProduct_grossamount(OrderDetail.getProduct_grossamount());
		list.setProduct_discount(OrderDetail.getProduct_discount());
		list.setProduct_netamount(OrderDetail.getProduct_netamount());
	

		
		return list;
	}
}
