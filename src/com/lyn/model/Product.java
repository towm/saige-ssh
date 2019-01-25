package com.lyn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author    Yaning Liu
 *
 * @filename  Product.java
 *
 * @date      2019-01-25
 *
 */
@Entity
@Table(name="_Product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="_id",nullable=false,unique=true)
	private long id;
	
	@Column(name="_name")
	private String name;
	
	@Column(name="_quality")
	private int quality;
    
	
	
	/**
	 * @param id
	 * @param name
	 * @param quality
	 */
	public Product(long id, String name, int quality) {
		super();
		this.id = id;
		this.name = name;
		this.quality = quality;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}
	
	
	
}
