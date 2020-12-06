package com.yashwant.microservices.currencyconversionservice.bean;

import java.math.BigDecimal;

public class CurrencyConversionBean {

	private long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private BigDecimal quantity;
	private BigDecimal totalAmount;
	private int port;
	
	public CurrencyConversionBean() {
		
	}
	
	public CurrencyConversionBean(long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
			BigDecimal totalAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
		this.port = port;
	}
	public long getId() {
		return id;
	}
	public String getFrom() {
		return from;
	}
	public String getTo() {
		return to;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public int getPort() {
		return port;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
	
}
