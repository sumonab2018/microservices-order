package com.wipro.dxp.order.models;

import java.util.Objects;

import org.springframework.data.annotation.Id;

public class BillingInfo {

	@Id
	private String id;
	
	private String customerId;
	
	private String address;
	
	private String city;
	
	private String pin;
	
	private String state;
	
	private String country;
	
	
	public String getId() {
		return id;
	}

	public BillingInfo setId(String id) {
		this.id = id;
		return this;
	}

	public String getCustomerId() {
		return customerId;
	}

	public BillingInfo setCustomerId(String customerId) {
		this.customerId = customerId;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public BillingInfo setAddress(String address) {
		this.address = address;
		return this;
	}

	public String getCity() {
		return city;
	}

	public BillingInfo setCity(String city) {
		this.city = city;
		return this;
	}

	public String getState() {
		return state;
	}

	public BillingInfo setState(String state) {
		this.state = state;
		return this;
	}

	public String getCountry() {
		return country;
	}

	public BillingInfo setCountry(String country) {
		this.country = country;
		return this;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BillingInfo billingInfo = (BillingInfo) o;
        return Objects.equals(id, billingInfo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
