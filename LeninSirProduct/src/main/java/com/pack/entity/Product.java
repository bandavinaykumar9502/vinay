package com.pack.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name",nullable = false)
	private String name;
	
	@Column(name = "cost",nullable = false)
	private int cost;
	
	@Column(name = "qty",nullable = false)
	private int qty;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Product(int id, String name, int cost, int qty) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.qty = qty;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
