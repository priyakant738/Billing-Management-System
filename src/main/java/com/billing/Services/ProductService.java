package com.billing.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billing.Repository.ProductRepository;
import com.billing.Repository.StateRepository;
import com.billing.entities.Product;
import com.billing.entities.State;
import com.billing.modelDTO.ProductModel;


@Service
public class ProductService {

	
	@Autowired
	private ProductRepository productRepository;

	
	public List<ProductModel> getAllProduct()
	{
		List<Product> list=(List<Product>)this.productRepository.findAll();
		
		List<ProductModel> list1 = new ArrayList<>();
		
		list.forEach(e->{
			list1.add(new ProductModel(e.getProductName(),e.getProductCode(),
					e.getProductPrice(),e.getProductDesc(),e.getProductStatus(),
					e.getCategoryId().getCategoryName(),
					e.getAgencyId().getAgencyName()));
});
		return list1;
		
	}
	
	//get the single product by id
	
		public Product getProductByid(Long id)
		{
			
			Product product=null;
			try 
			{
				 product = this.productRepository.getById(id);
				 
				
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
			
			list.setCategoryId(product.getCategoryId());
			list.setAgencyId(product.getAgencyId());
			list.setProductName(product.getProductName());
			list.setProduct_Code(product.getProduct_Code());
			list.setProductPrice(product.getProductPrice());
			list.setProductDesc(product.getProductDesc());
			list.setProductStatus(product.getProductStatus());
			
			productRepository.save(list);
			
			return list;
		}
}
