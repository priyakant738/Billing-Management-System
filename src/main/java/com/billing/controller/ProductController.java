package com.billing.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.billing.Services.ProductService;
import com.billing.entities.Product;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	//get all Product handler
	
	@GetMapping("/product")
	public ResponseEntity<List<Product>> getProduct()
	{
		List<Product>list = productService.getAllProduct();
		if(list.size()<= 0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.of(Optional.of(list));
	}
	
	
	//get single Product handler
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable("id")Long id)
	{
		Product product = productService.getProductByid(id);
		if(product==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			
		}
		return ResponseEntity.of(Optional.of(product));
	}
	
	//new Product handler
	
	@PostMapping("/product")
	public ResponseEntity<Product> addProduct(@RequestBody Product product)
	{
		Product p = null;
		
		try
		{
			p = this.productService.addProduct(product);
			System.out.println(product);
			return ResponseEntity.status(HttpStatus.CREATED).build();
			
		}
		 catch(Exception e)
		{
			 e.printStackTrace();
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	
	//delete product handler
	
	@DeleteMapping("/product/{id}")
	public ResponseEntity<Object> deleteProduct(@PathVariable("id")Long id)
	{
		try
	  {
		this.productService.deleteProduct(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	   }
		catch(Exception e)
		{
		  e.printStackTrace();
		  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	//update Product handler
	@PutMapping("/product/{id}")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product,@PathVariable("city_id") Long id)
	{
	  try {
		  Product List=this.productService.updateProduct(product, id);
		  return ResponseEntity.status(HttpStatus.OK).body(List);
	  }
	  catch(Exception e){
		  
		  e.printStackTrace();
		  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		  
	  }
	 
	  
	}

}
