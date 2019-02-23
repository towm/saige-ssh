package com.lyn.service;

import com.lyn.model.PTask;

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
	
	public void addProduct(Product product);
	
	public Product findById(int id);
	
	public List<Product> getProductList();
	
	public List<Product> findByName();
	
}
