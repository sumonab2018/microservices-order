package com.wipro.dxp.order.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModelProperty;

import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Domain class that represents a order.
 *
 * @author dxp
 */
@Document
public class Order {

    @Id
    @ApiModelProperty(notes = "The database generated order ID")
    private String id;
   
    @ApiModelProperty(notes = "Order's status. May return values such as 'complete', 'processing', 'cancelled', 'refunded'. Subject to changes as the order gets processed")
    private String status;
    
    @ApiModelProperty(notes = "Associated coupon applied to order")
    private String couponCode;
    
    @ApiModelProperty(notes = "The product details")
    private Set<Product> productDetails = new HashSet<>();
    
    @ApiModelProperty(notes = "The shipping information")
    private ShippingInfo shippingInfo;
    
    @ApiModelProperty(notes = "The billing information")
    private BillingInfo billingInfo;
    
    @ApiModelProperty(notes = "The tracking information")
    private Tracking tracking;
    
    @ApiModelProperty(notes = "The payment details information")
    private Payment paymentDetails;
    
    @ApiModelProperty(notes = "Discount value applied to order")
    private Double discountAmount;
    
    @ApiModelProperty(notes = "Tax value applied to order ")
    private Double taxAmount;
    
    @ApiModelProperty(notes = "Order's price of items included in the order. Taxes, shipping, etc are not included")
    private Double subtotal;
    
    @ApiModelProperty(notes = "Order's total value, including subtotal, tax, shipping, and discounts ")
    private Double grandTotal;
    
    @CreatedDate
    @ApiModelProperty(notes = "The order creation date")
    private DateTime createdDate;
    
    @LastModifiedDate
    @ApiModelProperty(notes = "The order record modified date")
    private DateTime lastModifiedDate;

	public String getId() {
		return id;
	}

	public Order setId(String id) {
		this.id = id;
		return this;
	}


	public DateTime getCreatedDate() {
		return createdDate;
	}

	public Order setCreatedDate(DateTime createdDate) {
		this.createdDate = createdDate;
		return this;
	}

	public Payment getPaymentDetails() {
		return paymentDetails;
	}

	public Order setPaymentDetails(Payment paymentDetails) {
		this.paymentDetails = paymentDetails;
		return this;
	}

	public Set<Product> getProductDetails() {
		return productDetails;
	}

	public Order setProductDetails(Set<Product> productDetails) {
		this.productDetails = productDetails;
		return this;
	}
	
	public ShippingInfo getShippingInfo() {
		return shippingInfo;
	}

	public Order setShippingInfo(ShippingInfo shippingInfo) {
		this.shippingInfo = shippingInfo;
		return this;
	}
	
	public String getStatus() {
		return status;
	}

	public Order setStatus(String status) {
		this.status = status;
		return this;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public Order setCouponCode(String couponCode) {
		this.couponCode = couponCode;
		return this;
	}

	public BillingInfo getBillingInfo() {
		return billingInfo;
	}

	public Order setBillingInfo(BillingInfo billingInfo) {
		this.billingInfo = billingInfo;
		return this;
	}

	public DateTime getLastModifiedDate() {
		return lastModifiedDate;
	}

	public Order setLastModifiedDate(DateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
		return this;
	}

	public Tracking getTracking() {
		return tracking;
	}

	public Order setTracking(Tracking tracking) {
		this.tracking = tracking;
		return this;
	}
	
	public Double getDiscountAmount() {
		return discountAmount;
	}

	public Order setDiscountAmount(Double discountAmount) {
		this.discountAmount = discountAmount;
		return this;
	}

	public Double getTaxAmount() {
		return taxAmount;
	}

	public Order setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
		return this;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public Order setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
		return this;
	}

	public Double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(Double grandTotal) {
		this.grandTotal = grandTotal;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
}
