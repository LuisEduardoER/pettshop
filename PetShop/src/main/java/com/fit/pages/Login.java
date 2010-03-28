package com.fit.pages;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.ioc.annotations.Inject;

import com.fit.interfaces.User;
import com.fit.service.Security;
import com.fit.service.Users;


public class Login {
	private String userName;
	@Property
    private String password;
    
	@Inject
	@Property
	private Users users;

	@SessionState
    private User user;

	Object onSubmitFromLoginForm() {
		System.out.println("In login form submit event handler!");
		Class nextPage = null;
		User authenticatedUser = Security.authenticate(userName, password, users);
		if (authenticatedUser != null) {
			user = authenticatedUser;
			nextPage = Index.class;
		} else {
			nextPage = Registration.class;
		}
		
		return nextPage;
	}
    
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }    

}
