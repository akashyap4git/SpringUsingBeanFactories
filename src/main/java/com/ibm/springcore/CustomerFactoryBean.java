package com.ibm.springcore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerFactoryBean {
	
	Logger logger = LoggerFactory.getLogger(CustomerFactoryBean.class);
	
	@Autowired
	private Country country;
	
	public CustomerFactoryBean() {
		logger.info("## -> -> -> -> CustomerFactoryBean() <- <- <- <- ##");
	}
	
	public enum CUST_TYPE {REGULAR, GUEST, ADMIN};
	
	private Customer createCustomerByType(String customerType) {
		if(CUST_TYPE.REGULAR.name().equals(customerType)) {
			Customer regCust = new Customer("REGULAR");
			regCust.setId(1L);
			regCust.setName("AK");
			regCust.setCountry(country);
			return regCust;
		} else if(CUST_TYPE.GUEST.name().equals(customerType)) {
			Customer guestCust = new Customer("GUEST");
			guestCust.setId(2L);
			guestCust.setName("Anonymous");
			guestCust.setCountry(country);
			return guestCust;
		} else {
			Customer adminCust = new Customer("ADMIN");
			adminCust.setId(3L);
			adminCust.setName("Administrator");
			adminCust.setCountry(country);
			return adminCust;
		}
	}
}
