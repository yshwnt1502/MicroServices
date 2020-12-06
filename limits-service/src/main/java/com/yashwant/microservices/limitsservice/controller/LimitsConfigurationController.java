package com.yashwant.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yashwant.microservices.limitsservice.Configuration;
import com.yashwant.microservices.limitsservice.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration configuration;

	@GetMapping(value="/limits")
	public LimitsConfiguration retrieveConfigurationDetails() {
		return new LimitsConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}

	
	
}
