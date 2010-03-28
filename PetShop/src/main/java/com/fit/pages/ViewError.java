package com.fit.pages;

import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.SessionState;

import com.fit.interfaces.User;

public class ViewError {
	@Persist
	private String passedMessage;

	public String getPassedMessage() {
		return passedMessage;
	}

	public void setPassedMessage(String passedMessage) {
		this.passedMessage = passedMessage;
	}

	public String getErrorMessage() {
		return this.passedMessage;
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

	// Obavezno za Page Activation Context
	void onActivate(String message) {
		this.passedMessage = message;
	}

	// Obavezno za Page Activation Context
	String onPassivate() {
		return passedMessage;
	}

}
