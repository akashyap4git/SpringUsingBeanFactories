package com.ibm.springcore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	
	private Logger logger = LoggerFactory.getLogger(Country.class);
	
	private String countryCode;
	
	private String countryName;
	
	private static Country country = new Country("IN", "INDIA");
	
	private Country(String countryCode, String countryName) {
		logger.info("## -> -> -> -> Country() <- <- <- <- ## -> -> " + countryCode + " -> -> " + countryName);
		this.countryCode = countryCode;
		this.countryName = countryName;
	}
	
	public static Country getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "Country [countryCode=" + countryCode + ", countryName=" + countryName + "]";
	}
}
