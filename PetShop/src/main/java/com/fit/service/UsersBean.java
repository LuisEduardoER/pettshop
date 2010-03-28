package com.fit.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.fit.interfaces.User;

public class UsersBean implements Users{
	private Map<String, User> users = new HashMap<String, User>();

	public Collection<User> retrieve() {
		return users.values();
	}

	public User retrieveSingleUser(String userName) {
		return users.get(userName);
	}

	public User save(User user) {
		return users.put(user.getUserName(), user);
	}

}
