package com.yashwant.microservices.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.yashwant.microservices.currencyconversionservice.bean.CurrencyConversionBean;



//@FeignClient(name="currency-exchange-service", url="http://localhost:8000")

@FeignClient(name= "currency-exchange-service")
@RibbonClient(name= "currency-exchange-service")
public interface CurrencyExchangeServiceProxy {

	@GetMapping(value="/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean  retrieveExchangeValue(@PathVariable("from") String from,@PathVariable("to") String to);
	
}
