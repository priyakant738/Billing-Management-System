package com.billing.Services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.Repository.OrderDetailRepository;
import com.billing.Repository.OrderRepository;
import com.billing.entities.Agency;
import com.billing.entities.Order;
import com.billing.entities.OrderDetail;
import com.billing.modelDTO.OrderModel;

@Service
public class OrderService {

	@Autowired
	public OrderRepository orderRepository;

	@Autowired
	public OrderDetailRepository orderDetailRepository;

	public List<OrderModel> getAllOrder() {
		List<Order> list = (List<Order>) this.orderRepository.findAll();

		List<OrderModel> list1 = new ArrayList<>();

		list.forEach(e -> {
			list1.add(new OrderModel(e.getAgencyId().getAgencyName(), e.getAgencyId().getOwnerFirstName(),
					e.getAgencyId().getOwnerLastname(), e.getAgencyId().getAgencyAddress(),
					e.getAgencyId().getAgencyPincode(), e.getDealerId().getDealerFirstname(),
					e.getDealerId().getDealerLastName(), e.getDealerId().getDealerAddress(),
					e.getDealerId().getPincode(), e.getRetailerId().getShopName(), e.getRetailerId().getFirstName(),
					e.getRetailerId().getLastName(), e.getRetailerId().getRetailerAddress(),
					e.getRetailerId().getRetailerPincode(), e.getGrossAmount(), e.getDiscountAmount(), e.getNetAmount(),
					e.getOrderNumber(), e.getOrderDate(), e.getOrderStatus(), e.getOrderType(), e.getOrderDuedate(),
					e.getPaymentType(), e.getPaymentDate(), e.getPaymentMode(), e.getPaymentStatus()));

		});

		return list1;

	}

	// Adding the order

	    public Order addOrder(Order o) {
		Order result = orderRepository.save(o);
		return result;

	}

	// get the single Order by id

	public Order getOrderByid(Long id) {

		Order order = null;
		try {
			order = this.orderRepository.getById(id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return order;

	}

	// delete Order
	public void deleteOrder(Long oid) {
		orderRepository.deleteById(oid);
	}

	// update the order

	public Order updateOrder(Order order, Long id) {

		Order list = orderRepository.getById(id);

		list.setAgencyId(order.getAgencyId());
		list.setDealerId(order.getDealerId());
		list.setRetailerId(order.getRetailerId());
		list.setGrossAmount(order.getGrossAmount());
		list.setDiscountAmount(order.getDiscountAmount());
		list.setNetAmount(order.getNetAmount());
		list.setOrderNumber(order.getOrderNumber());
		list.setOrderDate(order.getOrderDate());
		list.setOrderStatus(order.getOrderStatus());
		list.setOrderType(order.getOrderType());
		list.setOrderDuedate(order.getOrderDuedate());
		list.setPaymentType(order.getPaymentType());
		list.setPaymentDate(order.getPaymentDate());
		list.setPaymentStatus(order.getPaymentStatus());
		list.setPaymentid(order.getPaymentid());
		list.setPaymentMode(order.getPaymentMode());
		list.setDealerId(order.getDealerId());

		orderRepository.save(list);

		return list;
	}
	
        public List<Object> GetOrders(String orderFromDate, String ordertoDate) {
		
		List<Order> orderList = orderRepository.GetOrdersByDate(orderFromDate, ordertoDate);
		
		List<Object> orderinfo = new ArrayList<>();

				Map<String, Object> orders = new HashMap<String, Object>();
//				List<Object> setOrder = new ArrayList<>();
				
				String date =null;
				
				System.out.println(orderList);
				
				Long netAmount = 0L;
				Long grossAmount = 0L;
				Long discountAmount = 0L;
				
				
		for (Order e : orderList) {

				orders.put("retailerFirstName", e.getRetailerId().getFirstName());
				orders.put("retailerLastName", e.getRetailerId().getLastName());
				orders.put("dealerFirstName", e.getDealerId().getDealerFirstname());
				orders.put("dealerLastName", e.getDealerId().getDealerLastName());
				orders.put("paymentMode", e.getPaymentMode());
				if(e.getOrderDate().equals(date) && e.getOrderStatus().equals("successfull") || date==null) {
					netAmount += e.getNetAmount();
					grossAmount += e.getGrossAmount();
					discountAmount += e.getDiscountAmount();
				}else {
					orders.put("netAmount_sum", netAmount);
					orders.put("grossAmount_sum", grossAmount);
					orders.put("discountAmount", discountAmount);
					orderinfo.add(orders);
					netAmount=0L;
					grossAmount =0L;
					discountAmount=0L;
				}
				
				date = e.getOrderDate();
				
			}
			
		
		return orderinfo;

	}
	

	

}
