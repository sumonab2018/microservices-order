package com.wipro.dxp.order.models;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ShippingInfo {
	
	@Id
	private String id;
	
	private String customerId;
	
	private String address;
	
	private String city;
	
	private String pin;
	
	private String state;
	
	private String country;
	
	private String delivery_notes;
	
	private Double shippingAmount;
	
	private Double shippingTaxAmount;
	
	public String getId() {
		return id;
	}

	public ShippingInfo setId(String id) {
		this.id = id;
		return this;
	}

	public String getCustomerId() {
		return customerId;
	}

	public ShippingInfo setCustomerId(String customerId) {
		this.customerId = customerId;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public ShippingInfo setAddress(String address) {
		this.address = address;
		return this;
	}

	public String getCity() {
		return city;
	}

	public ShippingInfo setCity(String city) {
		this.city = city;
		return this;
	}

	public String getState() {
		return state;
	}

	public ShippingInfo setState(String state) {
		this.state = state;
		return this;
	}

	public String getCountry() {
		return country;
	}

	public ShippingInfo setCountry(String country) {
		this.country = country;
		return this;
	}

	public String getDelivery_notes() {
		return delivery_notes;
	}

	public ShippingInfo setDelivery_notes(String delivery_notes) {
		this.delivery_notes = delivery_notes;
		return this;
	}
	
	public String getPin() {
		return pin;
	}

	public ShippingInfo setPin(String pin) {
		this.pin = pin;
		return this;
	}
	
	public Double getShippingAmount() {
		return shippingAmount;
	}

	public ShippingInfo setShippingAmount(Double shippingAmount) {
		this.shippingAmount = shippingAmount;
		return this;
	}

	public Double getShippingTaxAmount() {
		return shippingTaxAmount;
	}

	public ShippingInfo setShippingTaxAmount(Double shippingTaxAmount) {
		this.shippingTaxAmount = shippingTaxAmount;
		return this;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShippingInfo shippingInfo = (ShippingInfo) o;
        return Objects.equals(id, shippingInfo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
