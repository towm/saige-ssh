package com.lyn.model;

import java.sql.Date;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="_USER")
public class User{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="_ID",nullable=false,unique=true)
	private long id;
	
	@Column(name="_NAME")
	private String name;

	////以字段名'password'映射到S_USER表中
	@Column(name="_PASSWORD")
	private String password;
	
////以字段名'password'映射到S_USER表中
	@Column(name="_ROLE")
	private String role;
	
	////不创建到数据库
	@Column(name="_EMAIL")
	private String email;
	
	@Column(name="_phone")
	private String phone;
	
	@Column(name="_city")
	private String city;
	
	@Column(name="_date")
	private String date;
	
	public User(String name,String password,String email,String role,String date,String city){
		super();
		this.name=name;
		this.password=password;
	    this.date=date;
	    this.role=role;
	    this.city=city;
		this.email=email;
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
	public User(){
		
	}
	
    
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
