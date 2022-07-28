package com.npci.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.ecommerce.entity.ProductCategory;


public interface ProdCategoryRepository extends JpaRepository<ProductCategory,Long> {

	//public List<ProductCategory> findAllCat();
}
