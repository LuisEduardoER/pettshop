package com.fit.pages;

import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.ioc.annotations.Inject;

import com.fit.interfaces.Salesman;
import com.fit.interfaces.User;
import com.fit.service.Salesmen;



public class ViewSalesman {
	@Inject
	@Property
	private Salesmen salesmen;
	
	@Property
	private Salesman currentSalesman;
	
	@InjectPage
	private EntryBuy entryBuy;
	
	@OnEvent(component = "entrySalesmanLink")
	Object onSalesmanLink(String name) {
		entryBuy.setBuySalesman(name);
		return entryBuy;
	}
	
	@SessionState
	private User user;

	private boolean userExists;
	
	public User getUser() {
		return user;
	}
	
	Object onActivate() {
		if (!userExists) return Login.class;
		return null;
	}

}
