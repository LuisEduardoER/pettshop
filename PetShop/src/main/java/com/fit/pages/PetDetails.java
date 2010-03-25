package com.fit.pages;

import org.apache.tapestry5.annotations.Persist;

import com.fit.interfaces.Pet;


public class PetDetails {
	@Persist
	private Pet chosenPet;

	public Pet getChosenPet() {
		return chosenPet;
	}

	public void setChosenPet(Pet chosenPet) {
		this.chosenPet = chosenPet;
	}
	
	

}
