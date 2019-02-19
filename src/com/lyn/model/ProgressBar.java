package com.lyn.model;

import com.lyn.model.Task;
/**
 * @author    Yaning Liu
 *
 * @filename  ProgressBar.java
 *
 * @date      2019-02-18
 *
 */
public class ProgressBar {
	private String width;
	private String color;
	private String name;

	private int task_id;
	
	
	
	
	
	/**
	 * 
	 */
	public ProgressBar() {
		super();
	}
	/**
	 * @param width
	 * @param color
	 * @param name
	 * @param task_id
	 */
	public ProgressBar(Task task) {
		super();
		this.width = this.getWidth2(task.getProgress());
		this.color = this.getColor2(task.getPriority());
		this.name = task.getName();
		this.task_id = this.getTask_id();
	}
	
	
	/**
	 * @return the width
	 */
	public String getWidth() {
		return width;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @return the width
	 */
	public String getWidth2(String value){
		switch(value) {
		case "Completed":return "100";
		case "Not Started":return "0";
		case "In Progress 50%":return "50";
		case "In Progress 20%":return "20";
		case "In Progress 80%":return "80";
		}
		return "0";
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(String width) {
		this.width = width;
	}
	/**
	 * @return the color
	 */
	public String getColor2(String value) {
		switch(value) {
		case "high":return "warning";
		case "low":return "success";
		case "medium":return "info";
		case "urgent":return "danger";
		}
		return "0";
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
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
	 * @return the task_id
	 */
	public int getTask_id() {
		return task_id;
	}
	/**
	 * @param task_id the task_id to set
	 */
	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}
	
	
	
}
