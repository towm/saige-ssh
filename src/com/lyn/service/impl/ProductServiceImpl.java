package com.lyn.service.impl;

import java.util.List;

/**
 * @author    Yaning Liu
 *
 * @filename  ProductService.java
 *
 * @date      2019-01-25
 *
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyn.dao.ProductDao;
import com.lyn.model.Product;
import com.lyn.service.ProductService;

@Service("productService")
public class ProductServiceImpl {
	
	@Autowired
	private ProductDao productDao;
	
	public void addProduct(Product product) {
		System.out.println("**********ProductService.add***********");
		this.productDao.addProduct(product);
	}
	
	public Product findById(int id) {
		return this.productDao.findById(id);
	}
	
	public List<Product> findByName(String name){
		return this.productDao.findByName(name);
	}
}
