package com.yashwant.microservices.currencyexchangeservices.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
 
	@Id
	private Long id;
	
	@Column(name="currency_To")
	private String to;
	@Column(name="currency_FROM")
	private String from;
	private BigDecimal conversionMultiple;
	private int port;
	
	public ExchangeValue() {
		
	}
	
	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.to = to;
		this.from = from;
		this.conversionMultiple = conversionMultiple;
		
	}


	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	

	public Long getId() {
		return id;
	}


	public String getTo() {
		return to;
	}


	public String getFrom() {
		return from;
	}


	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	
	
	
	
}
