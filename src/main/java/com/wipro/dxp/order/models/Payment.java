package com.wipro.dxp.order.models;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Payment {

	@Id
	private String id;
	
	private String method;
	
	private String transaction_id;

	public String getId() {
		return id;
	}

	public Payment setId(String id) {
		this.id = id;
		return this;
	}

	public String getMethod() {
		return method;
	}

	public Payment setMethod(String method) {
		this.method = method;
		return this;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public Payment setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
		return this;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(id, payment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
