package com.fit.pages;

import java.util.Date;

import org.apache.tapestry5.annotations.SessionState;

import com.fit.interfaces.User;

/**
 * Start page of application PetShop.
 */
public class Index
{
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
