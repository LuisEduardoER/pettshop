package com.fit.service;

import com.fit.interfaces.User;

public class Security {
	public static User authenticate(String userName, String password, Users users)
    {
    	User login = null;
    	
    	// Provjera user name-a i password-a
    	login = users.retrieveSingleUser(userName);
    	if (login == null) return null;
        if (login.getPassword().equals(password))
        {
            return login;
        }
        return null;
    }

}
