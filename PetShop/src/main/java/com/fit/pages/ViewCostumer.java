package com.fit.pages;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;

import com.fit.interfaces.Costumer;
import com.fit.service.Costumers;



public class ViewCostumer {
	@Inject
	@Property
	private Costumers costumers;
	
	
	@Property
	private Costumer currentCostumer;

}
