package com.sapient.productservice.dao;

import java.util.List;

import com.sapient.productservice.model.Product;

public interface ServicedaoProduct {
	 public Product saveProduct(Product product);

	    public List<Product> fetchAllProducts();

	    public Product findById(long id);

	    public void deleteProduct(long id);
	    public Product updateProduct1(long id,Product product);
}
