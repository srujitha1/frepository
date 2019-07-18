package com.sapient.productservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sapient.productservice.model.Product;


@Repository(value="mysqlDaoImp")
public class ServicedaoProductImp implements ServicedaoProduct {

	@Autowired
	JdbcTemplate jdbctemplate;
	 
	public Product saveProduct(Product product) {
		jdbctemplate.execute("insert into P values('"+product.getName()+"','"+product.getId()+"','"+product.getPrice()+"')");
		return product;
		
	}

	public List<Product> fetchAllProducts() {
		List<Product> products=jdbctemplate.query("select * from P", ( rs, rowNum)-> new Product(rs.getInt(2), rs.getString(1)));
		System.out.println(products);
		return products;
	}

	public Product findById(long id) {
			return jdbctemplate.queryForObject("select * from P where id="+id, ( rs, rowNum)-> 
			{
				Product product = new Product(rs.getInt(2), rs.getString(1));
				product.setPrice(rs.getDouble(3));
				return product;
				
			});
	}

	public void deleteProduct(long id) {
		jdbctemplate.execute("delete from P where id="+id);
			
			
		
	}
	public Product updateProduct1(long id,Product product)
	{
		 jdbctemplate.execute("update P set name='"+product.getName()+"' where id="+id);
			return product;	
	}
	

}
