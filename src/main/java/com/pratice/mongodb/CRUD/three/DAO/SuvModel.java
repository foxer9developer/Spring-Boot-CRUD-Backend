package com.pratice.mongodb.CRUD.three.DAO;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document (collection = "Suv")
public class SuvModel {
	@Id
	private int id;
	@NotNull(message = "Model name is important")
	private String model;
	@NotNull(message = "Name is important")
	private String name;
	@NotNull(message = "Price is important")
	private double price;
	
	
	public int getId() {
		return id;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
