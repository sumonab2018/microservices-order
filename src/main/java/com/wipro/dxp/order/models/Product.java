package com.wipro.dxp.order.models;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
public class Product {

	@Id
	private String id;

	private String name;

	//private String type;
	private String categoryId;

	private Double price;

	private String currency;

	private Integer quantity;

	private String aemlocation;

	private String productImageID;

	private String sku;

	public String getId() {
		return id;
	}

	public Product setId(String id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Product setName(String name) {
		this.name = name;
		return this;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public Product setCategoryId(String categoryId) {
		this.categoryId = categoryId;
		return this;
	}

	public Double getPrice() {
		return price;
	}

	public Product setPrice(Double price) {
		this.price = price;
		return this;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Product setQuantity(Integer quantity) {
		this.quantity = quantity;
		return this;
	}

	public String getSku() {
		return sku;
	}

	public Product setSku(String sku) {
		this.sku = sku;
		return this;
	}
	
	public String getAemlocation() {
		return aemlocation;
	}

	public Product setAemlocation(String aemlocation) {
		this.aemlocation = aemlocation;
		return this;
	}

	public String getProductImageID() {
		return productImageID;
	}

	public Product setProductImageID(String productImageID) {
		this.productImageID = productImageID;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Product product = (Product) o;
		return Objects.equals(id, product.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

}
