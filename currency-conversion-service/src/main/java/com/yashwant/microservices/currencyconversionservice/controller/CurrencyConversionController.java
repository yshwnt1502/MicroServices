package com.yashwant.microservices.currencyconversionservice.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.yashwant.microservices.currencyconversionservice.CurrencyExchangeServiceProxy;
import com.yashwant.microservices.currencyconversionservice.bean.CurrencyConversionBean;

@RestController
public class CurrencyConversionController {
	
@Autowired
private CurrencyExchangeServiceProxy proxy;
	
	@GetMapping(value="/currency-converter/from/{from}/to/{to}/{quantity}")
	public CurrencyConversionBean currencyConversion(@PathVariable String from,
			@PathVariable String to, 
			@PathVariable BigDecimal quantity) {
		
		
		Map<String,String> uriVariables=new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		
		ResponseEntity<CurrencyConversionBean> responseEntity=new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}",CurrencyConversionBean.class , uriVariables);

		CurrencyConversionBean response=responseEntity.getBody();
		
	return  new CurrencyConversionBean(response.getId(),from,to,response.getConversionMultiple(),quantity,quantity.multiply(response.getConversionMultiple()),response.getPort());
	
	}
	
	@GetMapping(value="/currency-converter-feign/from/{from}/to/{to}/{quantity}")
	public CurrencyConversionBean currencyConversionFeign(@PathVariable String from,
			@PathVariable String to, 
         	@PathVariable BigDecimal quantity) {
//		
//		
//		Map<String,String> uriVariables=new HashMap<>();
//		uriVariables.put("from", from);
//		uriVariables.put("to", to);
//		
//		ResponseEntity<CurrencyConversionBean> responseEntity=new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}",CurrencyConversionBean.class , uriVariables);

		CurrencyConversionBean response=proxy.retrieveExchangeValue(from, to);
		
	return  new CurrencyConversionBean(response.getId(),from,to,response.getConversionMultiple(),quantity,quantity.multiply(response.getConversionMultiple()),response.getPort());
	
	
	
    }
}