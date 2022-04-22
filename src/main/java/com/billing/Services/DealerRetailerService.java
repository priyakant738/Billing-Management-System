package com.billing.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.Repository.DealerRetailerRepository;
import com.billing.entities.AgencyDealer;
import com.billing.entities.DealerRetailer;


@Service
public class DealerRetailerService {

	@Autowired
	public DealerRetailerRepository dealerRetailerRepository;
	
	public List<DealerRetailer> getAllDealerRetailer()
	{
		List<DealerRetailer> list=dealerRetailerRepository.findAll();
		return list;
	}
	
	    //get the single DealerRetailer by id
	
			public DealerRetailer getDealerRetailerByid(Long id)
			{
				
				DealerRetailer dealerRetailer=null;
				try 
				{
					 dealerRetailer = this.dealerRetailerRepository.getById(id);
					 
					
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				return dealerRetailer;
				
			}
			
			//Adding the DealerRetailer
			
			public DealerRetailer addDealerRetailer(DealerRetailer dr)
			{
				DealerRetailer result=dealerRetailerRepository.save(dr);
				return result;
				
			}
			
			//delete DealerRetailer
			public DealerRetailer deleteDealerRetailer(Long sid)
			{
				DealerRetailer  list= dealerRetailerRepository.getById(sid);
				dealerRetailerRepository.deleteById(sid);
				
				return list;
			}
			
			//update the State
			
			public DealerRetailer updateDealerRetailer(DealerRetailer dealerRetailer, Long id)
			{
				
				DealerRetailer list= dealerRetailerRepository.getById(id);
				
				list.setDealer_id(dealerRetailer.getDealer_id());
				list.setRetailer_id(dealerRetailer.getRetailer_id());
				list.setCategory_id(dealerRetailer.getCategory_id());
				list.setProduct_id(dealerRetailer.getProduct_id());
				list.setProduct_grossamount(dealerRetailer.getProduct_grossamount());
				list.setProduct_netamount(dealerRetailer.getProduct_netamount());
				list.setProduct_discount(dealerRetailer.getProduct_discount());
				list.setStatus(dealerRetailer.getStatus());
				
				dealerRetailerRepository.save(list);
				
				return list;
			}
}
