package com.sapient.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sapient.productservice.dao.ServicedaoProduct;
import com.sapient.productservice.model.Product;



@Service(value="productService")
public class ServiceProductImp implements ServiceProduct{

	 @Autowired( required = true)
	 @Qualifier(value = "hibernatesql")
	 private ServicedaoProduct dao;
	 
	
	 public ServiceProductImp(@Qualifier(value = "hibernatesql") ServicedaoProduct dao ){
	        this.dao=dao;
	    }
	
	 @Transactional
	public Product saveProduct(Product product) {
		return dao.saveProduct(product);
	}

	 @Transactional
	public List<Product> fetchAllProducts() {
		// TODO Auto-generated method stub
		return dao.fetchAllProducts();
	}
	 @Transactional
	public Product findById(long id) {
		return dao.findById(id);
	}
	 @Transactional
	public void deleteProduct(long id) {
		dao.deleteProduct(id);
		
	}
	 @Transactional
	public Product updateProduct(long id,Product product)
	{
		return dao.updateProduct1(id,product);
	}
    
}
