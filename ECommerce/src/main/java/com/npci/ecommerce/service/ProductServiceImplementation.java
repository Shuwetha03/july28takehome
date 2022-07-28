package com.npci.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.ecommerce.entity.Product;
import com.npci.ecommerce.repository.ProductRepository;

@Service
public class ProductServiceImplementation implements ProductService{

	@Autowired
	ProductRepository prodRepo;

	public List<Product> findAll() {
		return prodRepo.findAll();
	}

	
	public Product findById(int prodId) {
		Optional<Product> p =  prodRepo.findById(prodId) ;
		Product product = null;
		
		if(p.isPresent())
			product = p.get();
		
		return product;
	}

	public void deleteById(Integer id) {
		prodRepo.deleteById(id);
		
	}
	
	public void save(Product p) {

		prodRepo.save(p);
	}
}
