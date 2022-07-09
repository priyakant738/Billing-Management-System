package com.billing.Services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.Repository.DealerRepository;
import com.billing.Repository.DealerRetailerRepository;
import com.billing.entities.AgencyDealer;
import com.billing.entities.Dealer;
import com.billing.entities.DealerRetailer;
import com.billing.entities.Retailer;
import com.billing.modelDTO.RetailerInformation;
import com.billing.modelDTO.DealerId1;
//import com.billing.modelDTO.DealerId2;
import com.billing.modelDTO.DealerModel;
import com.billing.modelDTO.DealerRetailerModel;


@Service
public class DealerRetailerService {

	@Autowired
	public DealerRetailerRepository dealerRetailerRepository;

	@Autowired
	public DealerRepository dealerRepository;

	public List<DealerRetailerModel> getAllDealerRetailer()
	{
		List<DealerRetailer> list=dealerRetailerRepository.findAll();

		List<DealerRetailerModel> list1 = new ArrayList<>();

		list.forEach(e->{
			list1.add(new DealerRetailerModel(e.getDealerId().getDealerFirstname(),
					e.getDealerId().getDealerLastName(),e.getDealerId().getDealerAddress()
					,e.getDealerId().getPincode(),e.getRetailerId().getShopName(),
					e.getRetailerId().getFirstName(),
					e.getRetailerId().getLastName(),e.getRetailerId().getRetailerAddress(),
					e.getRetailerId().getRetailerPincode(),e.getCategoryId().getCategoryCode(),
					e.getCategoryId().getCategoryName(),e.getProductGrossamount(),
					e.getProductNetamount(),e.getProductDiscount(),e.getStatus()));
		});


		return list1;
	}

	//get the single DealerRetailer by id

	public DealerRetailerModel getDealerRetailerByid(Long id)
	{

		DealerRetailer dealerRetailer=null;
		try 
		{
			dealerRetailer = this.dealerRetailerRepository.getById(id);
			DealerRetailerModel d = new DealerRetailerModel(dealerRetailer.getDealerId().getDealerFirstname(),
					dealerRetailer.getDealerId().getDealerLastName(),dealerRetailer.getDealerId().getDealerAddress()
					,dealerRetailer.getDealerId().getPincode(),dealerRetailer.getRetailerId().getShopName(),
					dealerRetailer.getRetailerId().getFirstName(),
					dealerRetailer.getRetailerId().getLastName(),
					dealerRetailer.getRetailerId().getRetailerAddress(),
					dealerRetailer.getRetailerId().getRetailerPincode(),
					dealerRetailer.getCategoryId().getCategoryCode(),
					dealerRetailer.getCategoryId().getCategoryName(),
					dealerRetailer.getProductGrossamount(),dealerRetailer.getProductNetamount(),
					dealerRetailer.getProductDiscount(),dealerRetailer.getStatus());

			return d;

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;

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

	//update the DealerRetailer

	public DealerRetailer updateDealerRetailer(DealerRetailer dealerRetailer, Long id)
	{

		DealerRetailer list= dealerRetailerRepository.getById(id);

		list.setDealerId(dealerRetailer.getDealerId());
		list.setRetailerId(dealerRetailer.getRetailerId());
		list.setCategoryId(dealerRetailer.getCategoryId());
		list.setProductId(dealerRetailer.getProductId());
		list.setProductGrossamount(dealerRetailer.getProductGrossamount());
		list.setProductNetamount(dealerRetailer.getProductNetamount());
		list.setProductDiscount(dealerRetailer.getProductDiscount());
		list.setStatus(dealerRetailer.getStatus());

		dealerRetailerRepository.save(list);

		return list;
	}

	// featching retailer under the dealer 



	public List<RetailerInformation> featchRetailerByDealer()
	{

		List<DealerRetailer> list= dealerRetailerRepository.findAll();
		List<RetailerInformation> de1 = new ArrayList<>();

		//				list.forEach(e->{
		//					
		//						de1.add(new DealerId(e.getDealerId().getDealerFirstname(),e.getDealerId().getDealerLastName(),
		//								e.getRetailerId().getFirstName(),e.getRetailerId().getLastName(),e.getRetailerId().getShopName()));
		//					
		//				});
		//				
		return de1;
	}

	//2

	//			public DealerId1 featchRetailerByDealerId(Long id)
	//			{
	//				
	//				List<DealerRetailer> list= dealerRetailerRepository.findAll();
	//				List<RetailerInformation> list1 = new ArrayList<>();
	//				
	//				Dealer dealer1 = dealerRepository.getById(id);
	//				
	//				DealerId1 dealer = new DealerId1(dealer1.getDealerFirstname(),dealer1.getDealerLastName());
	//				
	//				
	//				
	//				
	//				list.forEach(e->{
	//					if(e.getDealerId().getDealerId().equals(id)) {
	//						
	//						list1.add(new RetailerInformation(e.getRetailerId().getFirstName(),e.getRetailerId().getLastName(),e.getRetailerId().getShopName()));
	//						
	//						
	//							
	//							dealer.setRetailerInformation(list1);						
	//					}
	//				});
	//				
	//				
	//				
	//				return dealer;
	//			}



	//			public DealerId1 featchRetailerByDealerId(Long id)
	//			{
	//				
	//				List<DealerRetailer> list=  dealerRetailerRepository.featchRetailerByDealer(id);
	//				List<RetailerInformation> list1 = new ArrayList<>();
	//				
	//				Dealer dealer1 = dealerRepository.getById(id);
	//				
	//				DealerId1 dealer = new DealerId1(dealer1.getDealerFirstname(),dealer1.getDealerLastName());
	//				
	//				
	//				
	//				
	//				list.forEach(e->{
	//				
	//						
	//						list1.add(new RetailerInformation(e.getRetailerId().getFirstName(),e.getRetailerId().getLastName(),e.getRetailerId().getShopName()));
	//						
	//						
	//							
	//							dealer.setRetailerInformation(list1);						
	//					
	//				});
	//				
	//				
	//				
	//				return dealer;
	//			}



	//			public List<Object> featchRetailerByDealerId(Long id)
	//			{
	//				
	//				List<DealerRetailer> list=  dealerRetailerRepository.featchRetailerByDealer(id);
	//				List<Object> list1 = new ArrayList<>();
	//				Map<String,Object> map = new HashMap<>();
	//				Map<String,Object> map1 = new HashMap<>();
	//				
	//			
	//				list.forEach(e->{
	//				
	//					
	//					map.put("dealerFirstName", e.getDealerId().getDealerFirstname());
	//					map.put("dealerLastName", e.getDealerId().getDealerLastName());
	//									
	//				});
	//				
	//				list1.add(map);
	//				list.forEach(e->{
	//					
	//					map1.put("FirstName", e.getRetailerId().getFirstName());
	//					map1.put("LastName", e.getRetailerId().getLastName());
	//					map1.put("ShopName", e.getRetailerId().getShopName());
	//						
	//					list1.add(map1);
	//				});	
	//				
	//				return list1;
	//			}

















	//map

	//			public List<Object> featchRetailerByDealerId()
	//			{
	//				List<Dealer> dealer = dealerRepository.findAll();
	//				
	//				
	//				
	//				List<Object> retailerList = new ArrayList<>();
	//		
	//				
	//				for (Dealer e : dealer) {
	//					
	//					List<DealerRetailer> list=  dealerRetailerRepository.featchRetailerByDealer(e.getDealerId());
	//
	//					Map<String,Object> dealerMap = new HashMap<>();
	//					Map<String,List<Object>> listMap = new HashMap<>();
	//					
	//					dealerMap.put("DealerFirstname", e.getDealerFirstname());
	//					dealerMap.put("DealerLastname", e.getDealerLastName());
	//					
	//					
	//					
	//					
	//					List<Object> retailerh = new ArrayList<>();
	//					
	//					list.forEach(e1->{
	//						Map<String,Object> retailerMap = new HashMap<>();
	//						retailerMap.get(retailerMap);
	//						
	////						System.out.println(e1.getRetailerId().getRetailerId());
	//						retailerMap.put("FirstName", e1.getRetailerId().getFirstName());
	//						retailerMap.put("LastName", e1.getRetailerId().getLastName());
	//						retailerMap.put("ShopName", e1.getRetailerId().getShopName());
	//						
	//						retailerh.add(retailerMap);
	//						
	//						
	//					
	//					});		
	//					listMap.put("retailerInformation",new ArrayList());
	//					listMap.get("retailerInformation").add(retailerh);
	//
	//					
	//					
	//					retailerList.add(dealerMap);
	//					retailerList.add(listMap);
	//					
	//				}
	//				
	//				return retailerList;
	//			}




	//			public List<Object> featchRetailerByDealerId()
	//			{
	//				List<Dealer> dealer = dealerRepository.findAll();
	//				
	//				
	//				
	//				List<Object> dealerretailerList = new ArrayList<>();
	//		
	//				
	//				for (Dealer e : dealer) {
	//					
	//					List<DealerRetailer> list=  dealerRetailerRepository.featchRetailerByDealer(e.getDealerId());
	//
	//					Map<String,Object> dealerMap = new HashMap<>();
	//					Map<String,List<Object>> dealerretailermap = new HashMap<>();
	//					
	//					
	//					
	//					dealerMap.put("DealerFirstname", e.getDealerFirstname());
	//					dealerMap.put("DealerLastname", e.getDealerLastName());
	//					
	//
	//					
	//					
	//					List<Object> list1 = new ArrayList<>();
	//					
	//					
	//					
	//					list.forEach(e1->{
	//						Map<String,Object> retailerMap = new HashMap<>();
	//						
	////						System.out.println(e1.getRetailerId().getRetailerId());
	//						retailerMap.put("FirstName", e1.getRetailerId().getFirstName());
	//						retailerMap.put("LastName", e1.getRetailerId().getLastName());
	//						retailerMap.put("ShopName", e1.getRetailerId().getShopName());
	//						
	//					
	//		dealerLastName			});		
	//					
	//					dealerretailermap.put("retailerInformation",new ArrayList());
	//					dealerretailermap.get("retailerInformation").add(list1);
	//
	//					
	//					dealerretailerList.add(dealerMap);
	//					dealerretailerList.add(dealerretailermap);
	//					
	//					
	//				}
	//				
	//				return dealerretailerList;
	//			}


				public List<Object> featchRetailerByDealerId()
				{
					List<Dealer> dealer = dealerRepository.findAll();
					
					
					
					List<Object> dealerretailerList = new ArrayList<>();
			
					
					for (Dealer e : dealer) {
						
						List<DealerRetailer> list=  dealerRetailerRepository.featchRetailerByDealer(e.getDealerId());
						
						
							Map<String,Object> dealerMap = new HashMap<>();
							Map<String,List<Object>> dealerretailermap = new HashMap<>();
							
							
							
							dealerMap.put("DealerFirstname", e.getDealerFirstname());
							dealerMap.put("DealerLastname", e.getDealerLastName());
							
							
							
							
							List<Object> retailer1 = new ArrayList<>();
							
		                  if(!list.isEmpty()) {
							
							list.forEach(e1->{
								Map<String,Object> retailerMap = new HashMap<>();
								
	//							System.out.println(e1.getRetailerId().getRetailerId());
								retailerMap.put("FirstName", e1.getRetailerId().getFirstName());
								retailerMap.put("LastName", e1.getRetailerId().getLastName());
								retailerMap.put("ShopName", e1.getRetailerId().getShopName());
								
								retailer1.add(retailerMap);
							});		
							
							
							
							dealerretailermap.put("retailerInformation",new ArrayList());
							dealerretailermap.get("retailerInformation").add(retailer1);

							dealerretailerList.add(dealerMap);		
							dealerretailerList.add(dealerretailermap);

						}
	
					}
					
					return dealerretailerList;
				}

	//   class

//	public List<DealerId1> featchRetailerByDealerId()
//	{
//		List<Dealer> dealer = dealerRepository.findAll();
//		List<DealerId1> dealerRetailerInformation = new ArrayList<>();
//
//		for (Dealer e : dealer) {
//			List<DealerRetailer> list=  dealerRetailerRepository.featchRetailerByDealer(e.getDealerId());
//
//			List<RetailerInformation> retailer = new ArrayList<RetailerInformation>();
//					
//
//
//
//			list.forEach(e1->{
//
//
//				retailer.add(new RetailerInformation(e1.getRetailerId().getFirstName(),e1.getRetailerId().getLastName(),
//						e1.getRetailerId().getShopName()));
//
//			});		
//
//
//			if(!list.isEmpty()) {	
//
//				dealerRetailerInformation.add(new DealerId1(e.getDealerFirstname(),e.getDealerLastName(),retailer));
//
//			}
//
//
//		}
//		return dealerRetailerInformation;
//	}


	
	

	
	
	
	
}
