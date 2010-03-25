package com.fit.pages;

import java.util.LinkedList;

import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SetupRender;
import org.apache.tapestry5.ioc.annotations.Inject;

import com.fit.beans.CostumerBean;
import com.fit.interfaces.Buy;
import com.fit.interfaces.Costumer;
import com.fit.service.Costumers;



public class EntryCostumer {
	@Property
	@Persist
	private Costumer costumer;
	
	@Inject
	private Costumers costumers;
	
	@SetupRender
	public void createObject() {
		costumer = new CostumerBean();
		costumer.setBuy(new LinkedList<Buy>());
	}
	
	void onSuccess() {
		costumers.save(costumer);
	}

}
