package com.billing.Services;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.billing.Repository.DealerRepository;
import com.billing.entities.Dealer;
import com.billing.modelDTO.DealerModel;



@Service
public class DealerService
{
	
	@Autowired
	private DealerRepository dealerRepository;

	public List<DealerModel> getAllDealer()
	{
		List<Dealer> list=(List<Dealer>)this.dealerRepository.findAll();
		
		List<DealerModel> list1 = new ArrayList<>();
		
		list.forEach(e->{
			list1.add(new DealerModel(e.getDealerFirstname(),e.getDealerLastName(),
					e.getDealerAddress(),e.getPincode(),
					e.getCityId().getCityName(),e.getStateId().getStateName()));
		});
		
		return list1;
		
	}
	
	
	//get the single Dealer by id
	
	public Dealer getDealerByid(Long id)
	{
		
		Dealer dealer=null;
		try 
		{
			 dealer = this.dealerRepository.getById(id);
			 
			
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
				list.setDealerFirstname(dealer.getDealerFirstname());
				list.setDealerLastName(dealer.getDealerLastName());
				list.setDealerAddress(dealer.getDealerAddress());
				list.setPincode(dealer.getPincode());
				list.setStateId(dealer.getStateId());
				list.setCityId(dealer.getCityId());
				
				dealerRepository.save(list);
				
				return list;
			}

}
