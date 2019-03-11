package com.lyn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author    Yaning Liu
 *
 * @filename  Stock.java
 *
 * @date      2019-02-22
 *
 */

@Entity
@Table(name="_STask")
public class ProTask {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="_id",nullable=false,unique=true)
	private long id;
	
	@Column(name="_name")
	private String name;
	
	//stock in type or stock out type
	@Column(name="_type")
	private String type;
	
	@Column(name="_quality")
	private int quality;

	@ManyToOne
	@JoinColumn(name = "_pid")
	private Product product;


	public Product getProduct() {
	    return product;
	}

	public void setProduct(Product product) {
	    this.product=product;
	}
    @Column(name="_date")
    private String date;
    
    @Column(name="_progress")
    private String progress;
    
    @Column(name="_message")
    private String message;
	
    @Column(name="_priority")
    private String priority;
    
    //Belonging to a certain series of stock in or stock out task
    @Column(name="_listid")
    private int listid;
    
    
	

	/**
	 * @param id
	 * @param name
	 * @param type
	 * @param quality
	 * @param product
	 * @param date
	 * @param progress
	 * @param message
	 * @param priority
	 * @param listid
	 */
	public ProTask(long id, String name, String type, int quality, Product product, String date, String progress,
			String message, String priority, int listid) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.quality = quality;
		this.product = product;
		this.date = date;
		this.progress = progress;
		this.message = message;
		this.priority = priority;
		this.listid = listid;
	}
	
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the listid
	 */
	public int getListid() {
		return listid;
	}

	/**
	 * @param listid the listid to set
	 */
	public void setListid(int listid) {
		this.listid = listid;
	}

	
	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}

	
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	public ProTask() {
		
	}
	

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the progress
	 */
	public String getProgress() {
		return progress;
	}

	/**
	 * @param progress the progress to set
	 */
	public void setProgress(String progress) {
		this.progress = progress;
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
