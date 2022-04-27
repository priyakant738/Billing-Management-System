package com.billing.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.Repository.OrderRepository;
import com.billing.entities.Order;


@Service
public class OrderService {
	
	@Autowired
	public OrderRepository orderRepository;
	
	public List<Order> getAllOrder()
	{
		List<Order> list=(List<Order>)this.orderRepository.findAll();
		return list;
		
	}
	
	//get the single Order by id
	
			public Order getOrderByid(Long id)
			{
				
				Order order=null;
				try 
				{
					 order = this.orderRepository.find(id);
					 
					
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				return order;
				
			}
			
			//Adding the State
			
			public Order addOrder(Order o)
			{
				Order result=orderRepository.save(o);
				return result;
				
			}
			

			 //delete Order
			public void deleteOrder(Long oid)
			{
				orderRepository.deleteById(oid);
			}
			
			//update the State
			
			public Order updateOrder(Order order, Long id)
			{
				
				Order list= orderRepository.getById(id);
				
//				list.setAgency_id(order.getAgency_id());
//				list.setDealer_id(order.getDealer_id());
//				list.setRetailer_id(order.getRetailer_id());
//				list.setGross_amount(order.getDiscount_amount());
//				list.setDiscount_amount(order.getDiscount_amount());
//				list.setNet_amount(order.getNet_amount());
//				list.setOrder_number(order.getOrder_number());
//				list.setOrder_date(order.getOrder_date());
//				list.setOrder_status(order.getOrder_status());
//				list.setOrder_type(order.getOrder_type());
//				list.setOrder_duedate(order.getOrder_date());
//				list.setPayment_type(order.getOrder_type());
//				list.setPayment_date(order.getPayment_date());
//				list.setPayment_status(order.getOrder_status());
//				list.setPayment_id(order.getPayment_id());
//				list.setPayment_mode(order.getPayment_mode());				
				
				orderRepository.save(list);
				
				return list;
			}
			

}
