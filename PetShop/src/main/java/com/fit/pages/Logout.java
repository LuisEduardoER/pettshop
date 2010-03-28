package com.fit.pages;

import org.apache.tapestry5.annotations.ApplicationState;

import com.fit.interfaces.User;

public class Logout {
	@ApplicationState
    private User user;

	Object onActivate() {
		user = null;
		return Index.class;
	}

}
