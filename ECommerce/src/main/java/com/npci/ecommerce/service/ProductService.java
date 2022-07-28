package com.npci.ecommerce.service;



import java.util.List;

import com.npci.ecommerce.entity.Product;


public interface ProductService {

	public List<Product> findAll();

	public void save(Product p);
	
	public void deleteById(Integer id);
	
	public Product findById(int prodId);
}
