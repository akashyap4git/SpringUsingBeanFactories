package com.ibm.springcore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer {
	
	private Logger logger = LoggerFactory.getLogger(CustomerFactory.class);
	
	private Long id;
	
	private String name;
	
	private String type;
	
	private Country country;
	
	public Customer() {
		logger.info("## -> -> -> -> Customer() <- <- <- <- ##");
	}
	
	Customer(String type) {
		logger.info("## -> -> -> -> Customer(type) <- <- <- <- ## -> -> " + type);
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", type=" + type + ", country=" + country + "]";
	}
}
