package com.sapient.productservice.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sapient.productservice.model.Product;

@Repository(value="hibernatesql")
public class HibernateSql implements ServicedaoProduct {
	
	
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public Product saveProduct(Product product) {
		Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        return product;
	}

	@Override
	public List<Product> fetchAllProducts() {
		Session currentSession = sessionFactory.getCurrentSession();
        return currentSession.createQuery(" from Product").list(); //// from class name of the product
	}

	@Override
	public Product findById(long id) {
		return sessionFactory.getCurrentSession().get(Product.class, id);
	}

	@Override
	public void deleteProduct(long id) {
		 Session session = sessionFactory.getCurrentSession();
	        Product product = session.byId(Product.class).load(id);
	        session.delete(product);
		
	}

	@Override
	public Product updateProduct1(long id, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

}
