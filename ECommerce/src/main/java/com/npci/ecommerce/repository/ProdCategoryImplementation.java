//package com.npci.ecommerce.repository;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//
//import org.hibernate.Session;
//import org.hibernate.query.Query;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.npci.ecommerce.entity.ProductCategory;
//
//@Repository
//public class ProdCategoryImplementation implements ProdCategoryRepository {
//
//	@Autowired
//	EntityManager entityManager;
//	
//	@Override
//	public List<ProductCategory> findAllCat() {
//		Session currSession = entityManager.unwrap(Session.class);
//		Query<ProductCategory> query = currSession.createQuery("select e from ProductCategory e", ProductCategory.class);
//		
//		List<ProductCategory> catList = query.getResultList();
//		return catList;
//	}
//}
