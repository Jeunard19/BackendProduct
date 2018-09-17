package com.winstgenerator.backend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.winstgenerator.backend.model.Product;

public interface IProductDao extends CrudRepository<Product, Long > {
	
	@Override
	public List<Product> findAll(); 
	
	//public List<Product> findbyCategory(String categoryName); 
	
	//@Query("SELECT p FROM Product p WHERE p.price < :price")
	//public List<Product> findUnderCertainPrice(@Param("price") double priceArgs);
	
	

}
