package com.lyn.dao;



import java.util.List;

/**
 * @author    Yaning Liu
 *
 * @filename  ProductDao.java
 *
 * @date      2019-01-25
 *
 */
import com.lyn.model.Product;

public interface ProductDao{
	
	public void addProduct(Product product) ;
	
	public Product findById(long id) ;
	
	public List<Product> findByName(String name) ;
	
	public void update(Product product);
	
	public List<Product> getProductList();
}
