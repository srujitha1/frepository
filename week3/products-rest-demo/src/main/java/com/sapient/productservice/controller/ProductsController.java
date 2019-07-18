package com.sapient.productservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.productservice.model.Product;
import com.sapient.productservice.service.ServiceProduct;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;


@RestController
@RequestMapping("/api/v1/products")
@EnableSwagger2

public class ProductsController {
	 
	@Autowired
	ServiceProduct service;
	
	@GetMapping(value="/",produces= {APPLICATION_JSON_VALUE,APPLICATION_XML_VALUE})
	//@ApiOperation(value = "Fetch all products", notes = "API to fetch all the products")
	public List<Product> ListAll(){
		List<Product> products = service.fetchAllProducts();
		System.out.println(products);
		return products;
	}
	
	@GetMapping(value="/{id}",produces= {APPLICATION_JSON_VALUE,APPLICATION_XML_VALUE})
	
	public Product findById(    @ApiParam(value = "${EmployeeController.getEmployeeById}", required = true )@PathVariable("id") long id) {
		return service.findById(id);
	}
	
	@PostMapping(value="/",consumes= {APPLICATION_JSON_VALUE,APPLICATION_XML_VALUE})
	public Product saveProduct(@RequestBody  Product product)
	{
		return service.saveProduct(product);
	}
	
	@PutMapping(value="/{id}",consumes= {APPLICATION_JSON_VALUE,APPLICATION_XML_VALUE})
	public Product updateProduct( @PathVariable("id") long id,@RequestBody Product product)
	{
		return service.updateProduct(id, product);
	}
	
	@DeleteMapping(value="/{id}",consumes= {APPLICATION_JSON_VALUE,APPLICATION_XML_VALUE})
	public void deleteProduct(@PathVariable("id")  long id)
	{
		service.deleteProduct(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
