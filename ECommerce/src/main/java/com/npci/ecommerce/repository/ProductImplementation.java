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
//import com.npci.ecommerce.entity.Product;
//
//@Repository
//public class ProductImplementation implements ProductRepository{
//
//	@Autowired
//	EntityManager entityManager;
//	
//	@Override
//	public List<Product> findAllProd() {
//		Session currSession = entityManager.unwrap(Session.class);
//		Query<Product> query = currSession.createQuery("select e from Product e", Product.class);
//		
//		List<Product> prodList = query.getResultList();
//		return prodList;
//	}
//
//	@SuppressWarnings("deprecation")
//	@Override
//	public Product findByID(long prodId) {
//		Session currSession = entityManager.unwrap(Session.class);
//		Query<Product> query = currSession.createQuery("select e from Product e where id = ?1", Product.class);
//		query.setLong(1, prodId);
//		
//		Product prod = query.getSingleResult();
//		return prod;
//	}
//}
