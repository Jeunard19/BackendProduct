package com.winstgenerator.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.winstgenerator.backend.dao.IProductDao;
import com.winstgenerator.backend.model.Product;



@Service
public class ProductService implements IProductService {
	
	@Autowired
	private IProductDao iProductDao; 

	@Override
	public List<Product> findAll() {
		return this.iProductDao.findAll(); 
	}

	//@Override
	//public List<Product> findbyCategory(String categoryName) {
	//	return this.iProductDao.findbyCategory(categoryName); 
	//}
	
	@Override
	public Optional<Product> findOne(Long id) {
		if (id < 0)
			return Optional.empty();

		return this.iProductDao.findById(id);
	}

	@Override
	public Product create (Product product) {
		

			Assert.notNull(product, "Product may not be null");

			return this.iProductDao.save(product);
		}
	
}
