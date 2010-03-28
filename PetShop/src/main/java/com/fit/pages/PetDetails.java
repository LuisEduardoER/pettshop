package com.fit.pages;

import org.apache.tapestry5.annotations.Persist;

import org.apache.tapestry5.annotations.SessionState;

import com.fit.interfaces.Pet;
import com.fit.interfaces.User;


public class PetDetails {
	
	@Persist("flash")
	private Pet chosenPet;

	public Pet getChosenPet() {
		return chosenPet;
	}

	public void setChosenPet(Pet chosenPet) {
		this.chosenPet = chosenPet;
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
