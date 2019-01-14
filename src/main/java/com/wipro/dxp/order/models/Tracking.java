package com.wipro.dxp.order.models;

import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Tracking {
	
	@Id
	private String id;
	
	private String company;
	
	private String tracking_number;
	
	private String status;
	
	private Date estimated_delivery;
	
	
	public String getId() {
		return id;
	}

	public Tracking setId(String id) {
		this.id = id;
		return this;
	}

	public String getCompany() {
		return company;
	}

	public Tracking setCompany(String company) {
		this.company = company;
		return this;
	}

	public String getTracking_number() {
		return tracking_number;
	}

	public Tracking setTracking_number(String tracking_number) {
		this.tracking_number = tracking_number;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public Tracking setStatus(String status) {
		this.status = status;
		return this;
	}

	public Date getEstimated_delivery() {
		return estimated_delivery;
	}

	public Tracking setEstimated_delivery(Date estimated_delivery) {
		this.estimated_delivery = estimated_delivery;
		return this;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tracking tracking = (Tracking) o;
        return Objects.equals(id, tracking.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
