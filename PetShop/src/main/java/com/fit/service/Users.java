package com.fit.service;

import java.util.Collection;

import com.fit.interfaces.User;

public interface Users {
	User save(User user);
	Collection<User> retrieve();
	User retrieveSingleUser(String userName);


}
