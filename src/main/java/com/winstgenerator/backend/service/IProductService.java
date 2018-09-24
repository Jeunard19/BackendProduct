package com.winstgenerator.backend.service;

import java.util.List;
import java.util.Optional;

import com.winstgenerator.backend.model.Product;


public interface IProductService {
	
	public List<Product> findAll(); 
	
	//public List<Product> findbyCategory(String categoryName); 
	
	public Optional<Product> findOne(Long id);

	public Product create(Product product);
	
	public Optional<Product> findbyuserId(Long userId);
	

}
