package com.billing.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.Repository.ProductRepository;
import com.billing.Repository.StateRepository;
import com.billing.entities.Product;
import com.billing.entities.State;


@Service
public class ProductService {

	
	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProduct()
	{
		List<Product> list=(List<Product>)this.productRepository.findAll();
		return list;
		
	}
	
	//get the single product by id
	
		public Product getProductByid(Long id)
		{
			
			Product product=null;
			try 
			{
				 product = this.productRepository.find(id);
				 
				
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			return product;
			
		}
		
		
		//Adding the product
		
		public Product addProduct(Product p)
		{
			Product result=productRepository.save(p);
			return result;
			
		}
		

		 //delete product
		public void deleteProduct(Long sid)
		{
			productRepository.deleteById(sid);
		}
		
		
		//update the product
		
		public Product updateProduct(Product product, Long id)
		{
			
			Product list= productRepository.getById(id);
			
			list.setCategory_id(product.getCategory_id());
			list.setAgency_id(product.getAgency_id());
			list.setProduct_name(product.getProduct_name());
			list.setProduct_code(product.getProduct_code());
			list.setProduct_price(product.getProduct_price());
			list.setProduct_desc(product.getProduct_desc());
			list.setProduct_status(product.getProduct_status());
			
			productRepository.save(list);
			
			return list;
		}
}
