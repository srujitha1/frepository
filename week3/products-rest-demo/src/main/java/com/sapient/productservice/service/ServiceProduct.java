package com.sapient.productservice.service;

import java.util.List;

import com.sapient.productservice.model.Product;



public interface ServiceProduct {
	 public Product saveProduct(Product product);

	    public List<Product> fetchAllProducts();

	    public Product findById(long id);

	    public void deleteProduct(long id);
	    
	    public Product updateProduct(long id,Product product);
}
