package com.lyn.service;

/**
 * @author    Yaning Liu
 *
 * @filename  ProductService.java
 *
 * @date      2019-01-25
 *
 */

import com.lyn.model.Product;

import java.util.List;

public interface ProductService {
	
	public void add(Product product);
	
	public Product findById(int id);
	
	public List<Product> findByName();
	
}
