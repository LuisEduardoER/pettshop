package com.fit.pages;

import org.apache.tapestry5.annotations.InjectPage;

import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.ioc.annotations.Inject;

import com.fit.interfaces.Costumer;
import com.fit.interfaces.User;
import com.fit.service.Costumers;



public class ViewCostumer {
	@Inject
	@Property
	private Costumers costumers;
	
	
	@Property
	private Costumer currentCostumer;
	@InjectPage
	private EntryBuy entryBuy;
	
	@OnEvent(component = "entryCostumerLink")
	Object onCustomerLink(String name) {
		entryBuy.setBuyCostumer(name);
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
