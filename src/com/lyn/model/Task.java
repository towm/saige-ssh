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
 * @filename  Task.java
 *
 * @date      2019-02-16
 *
 */


@Entity
@Table(name="_Task")
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="_id",nullable=false,unique=true)
	private long id;
	
	@Column(name="_name")
	private String name;
	
	@Column(name="_quality")
	private int quality;
    
    @Column(name="_date")
    private String date;
    
    @Column(name="_progress")
    private String progress;
    
    @Column(name="_message")
    private String message;
	
    @Column(name="_ptaskid")
    private long ptaskid;
	
    @Column(name="_produceid")
    private long produceid;
    
    @Column(name="_stockid")
    private long stockid;
    
    @Column(name="_priority")
    private String priority;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the quality
	 */
	public int getQuality() {
		return quality;
	}

	/**
	 * @param quality the quality to set
	 */
	public void setQuality(int quality) {
		this.quality = quality;
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

	/**
	 * @return the ptaskid
	 */
	public long getPtaskid() {
		return ptaskid;
	}

	/**
	 * @param ptaskid the ptaskid to set
	 */
	public void setPtaskid(long ptaskid) {
		this.ptaskid = ptaskid;
	}

	/**
	 * @return the produceid
	 */
	public long getProduceid() {
		return produceid;
	}

	/**
	 * @param produceid the produceid to set
	 */
	public void setProduceid(long produceid) {
		this.produceid = produceid;
	}

	/**
	 * @return the stockid
	 */
	public long getStockid() {
		return stockid;
	}

	/**
	 * @param stockid the stockid to set
	 */
	public void setStockid(long stockid) {
		this.stockid = stockid;
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
	 * @param id
	 * @param name
	 * @param quality
	 * @param date
	 * @param progress
	 * @param message
	 * @param ptaskid
	 * @param produceid
	 * @param stockid
	 * @param priority
	 */
	public Task(long id, String name, int quality, String date, String progress, String message, long ptaskid,
			long produceid, long stockid, String priority) {
		super();
		this.id = id;
		this.name = name;
		this.quality = quality;
		this.date = date;
		this.progress = progress;
		this.message = message;
		this.ptaskid = ptaskid;
		this.produceid = produceid;
		this.stockid = stockid;
		this.priority = priority;
	}

	/**
	 * 
	 */
	public Task() {
	
	}
    
	
  
	
	
}
