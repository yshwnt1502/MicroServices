package com.yashwant.microservices.currencyexchangeservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyExchangeServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServicesApplication.class, args);
	}

}
