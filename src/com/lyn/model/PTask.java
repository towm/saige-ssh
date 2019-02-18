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
@Table(name="_Ptask")
public class PTask {
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
	
    @Column(name="_priority")
    private String priority;
    
    @Column(name="_listid")
    private int listid;
    
    
	/**
	 * @param id
	 * @param name
	 * @param quality
	 * @param date
	 * @param progress
	 * @param message
	 * @param priority
	 * @param listid
	 */
	public PTask(long id, String name, int quality, String date, String progress, String message, String priority,
			int listid) {
		super();
		this.id = id;
		this.name = name;
		this.quality = quality;
		this.date = date;
		this.progress = progress;
		this.message = message;
		this.priority = priority;
		this.listid = listid;
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
	 * @param id
	 * @param name
	 * @param quality
	 * @param date
	 * @param progress
	 * @param message
	 * @param priority
	 */
	public PTask(long id, String name, int quality, String date, String progress, String message, String priority) {
		super();
		this.id = id;
		this.name = name;
		this.quality = quality;
		this.date = date;
		this.progress = progress;
		this.message = message;
		this.priority = priority;
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
	 */
	public PTask(long id, String name, int quality, String date, String progress, String message) {
		super();
		this.id = id;
		this.name = name;
		this.quality = quality;
		this.date = date;
		this.progress = progress;
		this.message = message;
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

	public PTask() {
		
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
