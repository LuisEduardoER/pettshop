package com.fit.pages;



import org.apache.tapestry5.annotations.InjectPage;


import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.ioc.annotations.Inject;

import com.fit.interfaces.*;
import com.fit.service.Pets;



public class ViewPet {

	@Inject
	@Property
	private Pets pets;
	
	@Property
	private Pet currentPet;
	
	@InjectPage
	private PetDetails petDetailsPage;
	
	@InjectPage
	private EntryBuy entryBuy;
	
	@OnEvent(component = "petDetailsLink")
	Object onShowDetails(String petName) {
		Pet chosenPet = pets.retriveSinglePet(petName);
		petDetailsPage.setChosenPet(chosenPet);
		return petDetailsPage;
	}
	@OnEvent(component = "entryBuyLink")
	Object onPetLink(String petName) {
		entryBuy.setBuyPet(petName);
		return entryBuy;
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
//	@Persist
//	private Pet singlePet;
//
//	public Pet getSinglePet() {
//		return singlePet;
//	}
//
//	public void setSinglePet(Pet singlePet) {
//		this.singlePet = singlePet;
//	}


}
