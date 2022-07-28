package com.npci.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.ecommerce.entity.ProductCategory;
import com.npci.ecommerce.repository.ProdCategoryRepository;

@Service
public class ProductCatServiceImplementation implements ProductCategoryService {

	@Autowired
	ProdCategoryRepository catRepo;
	
	
	public List<ProductCategory> findAll() {
		return catRepo.findAll();
	}


	@Override
	public void save(ProductCategory c) {
		catRepo.save(c);
	}

	@Override
	public ProductCategory findById(long id) {
		Optional<ProductCategory> c =  catRepo.findById(id) ;
		ProductCategory category = null;
		
		if(c.isPresent())
			category = c.get();
		
		return category;
	}

	public void deleteById(long id) {
		catRepo.deleteById(id);
		
	}
}
