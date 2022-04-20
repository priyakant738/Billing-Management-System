package com.billing.Services;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.billing.Repository.DealerRepository;
import com.billing.entities.Dealer;



@Service
public class DealerService
{
	
	@Autowired
	private DealerRepository dealerRepository;

	public List<Dealer> getAllDealer()
	{
		List<Dealer> list=(List<Dealer>)this.dealerRepository.findAll();
		return list;
		
	}
	
	
	//get the single Dealer by id
	
	public Dealer getDealerByid(Long id)
	{
		
		Dealer dealer=null;
		try 
		{
			 dealer = this.dealerRepository.find(id);
			 
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return dealer;
		
	}
	
	//Adding the Dealer
	
	public Dealer addDealer(Dealer d)
	{
		Dealer result=dealerRepository.save(d);
		return result;
		
	}
	
	
	 //delete Dealer
	public void deleteDealer(Long did)
	{
		dealerRepository.deleteById(did);
	}

	
	        //update the Dealer
	
	
			public Dealer updateDealer(Dealer dealer, Long id)
			{
				
				Dealer list= dealerRepository.getById(id);
				list.setDealer_firstname(dealer.getDealer_firstname());
				list.setDealer_lastname(dealer.getDealer_lastname());
				list.setDealer_address(dealer.getDealer_address());
				list.setPincode(dealer.getPincode());
				list.setState_id(dealer.getState_id());
				list.setCity_id(dealer.getCity_id());
				
				dealerRepository.save(list);
				
				return list;
			}

}
