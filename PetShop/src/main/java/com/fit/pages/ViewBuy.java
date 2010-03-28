package com.fit.pages;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.ioc.annotations.Inject;

import com.fit.interfaces.Buy;
import com.fit.interfaces.Pet;

import com.fit.interfaces.User;
import com.fit.service.Buys;

public class ViewBuy {
	@Inject
	@Property
	private Buys buys;
	
	@Property
	private Buy currentBuy;
	
	public Pet getFirstPet() {
		return currentBuy.getPet().get(0);
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
