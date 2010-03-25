package com.fit.pages;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;

import com.fit.interfaces.Salesman;
import com.fit.service.Salesmen;



public class ViewSalesman {
	@Inject
	@Property
	private Salesmen salesmen;
	
	@Property
	private Salesman currentSalesman;

}
