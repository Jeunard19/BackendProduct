package com.winstgenerator.backend.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.winstgenerator.backend.model.Product;

public interface IProductDao extends CrudRepository<Product, Long > {
	
	@Override
	public List<Product> findAll(); 
	
	@Query ("SELECT p FROM Product p WHERE p.userId = :userId")
	public Optional<Product> findbyuserId(@Param("userId") Long userId);
	
	//public List<Product> findbyCategory(String categoryName); 
	
	//@Query("SELECT p FROM Product p WHERE p.price < :price")
	//public List<Product> findUnderCertainPrice(@Param("price") double priceArgs);
	
	

}
