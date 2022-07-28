package com.npci.ecommerce.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.ecommerce.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Integer>{
//
//	public List<Product> findAllProd();
//	public Product findByID(long prodId);
}
