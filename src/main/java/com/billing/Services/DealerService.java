package com.billing.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.billing.Repository.DealerRepository;
import com.billing.entities.Dealer;


@Component
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
	
	
	 //detele Dealer
	public void deleteDealer(Long did)
	{
		dealerRepository.deleteById(did);
	}

	
	//update the Dealer
	
	public void updateDealer(Dealer dealer, Long dealerid)
	{
		dealer.setDealer_id(dealerid);
		
		dealerRepository.save(dealer);
	}
	

}
