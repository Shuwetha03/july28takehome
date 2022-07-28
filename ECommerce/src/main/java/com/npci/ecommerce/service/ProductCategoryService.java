package com.npci.ecommerce.service;

import java.util.List;

import com.npci.ecommerce.entity.ProductCategory;


public interface ProductCategoryService {


	public List<ProductCategory> findAll();

	public void save(ProductCategory c);
	
	public ProductCategory findById(long id);
	
	public void deleteById(long id);
	
}
