package com.fit.pages;

import java.util.LinkedList;


import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.annotations.SetupRender;
import org.apache.tapestry5.ioc.annotations.Inject;

import com.fit.beans.SalesmanBean;
import com.fit.interfaces.Buy;
import com.fit.interfaces.Salesman;
import com.fit.interfaces.User;
import com.fit.service.Salesmen;


public class EntrySalesman {

	@Property
	@Persist
	private Salesman salesman;
	
	@Inject
	private Salesmen salesmen;
	
	@SetupRender
	public void createObject() {
		salesman = new SalesmanBean();
		salesman.setBuy(new LinkedList<Buy>());
	}
	

	void onSuccess() {
		salesmen.save(salesman);
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
