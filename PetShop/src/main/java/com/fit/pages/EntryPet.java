package com.fit.pages;



import java.util.LinkedList;


import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.annotations.SetupRender;
import org.apache.tapestry5.ioc.annotations.Inject;

import com.fit.beans.PetBean;
import com.fit.interfaces.Buy;
import com.fit.interfaces.Pet;
import com.fit.interfaces.User;
import com.fit.service.Pets;





public class EntryPet {
	@Property
	@Persist
	private Pet pet;

	@Inject
	private Pets pets;
	
	@SetupRender
	public void createObject() {
		pet= new PetBean();
		pet.setBuy(new LinkedList<Buy>());
	}

	void onSuccess() {
		pets.save(pet);
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
//	private String petName = "Unesite ime ljubimca";
//	private String petType = "Unesite vrstu ljubimca";
//	private String petShortDescription = "Unesite kratak opis";
//	
//	@InjectPage
//	private ViewPet viewPetPage;
//	@InjectPage
//	private Error errorPage;
//	
//	
//	@OnEvent(value = "submit", component = "petInputForm")
//	Object onFromSubmit(){
//		Pet PetBean = new PetBean();
//		PetBean.setBuy(new LinkedList<Buy>());
//		PetBean.setPetName(petName);
//		PetBean.setType(petType);
//		PetBean.setShortDescription(petShortDescription);
//		if(PetBean.getPetName() == null || PetBean.getType() == null){
//			errorPage.setError("Nije moguce dodati ljubimca ukoliko se ne unese ime ili vrsta");
//		return errorPage;
//		}
//		viewPetPage.setSinglePet(PetBean);
//		return viewPetPage;
//		}
//
//
//	public String getPetName() {
//		return petName;
//	}
//
//
//	public void setPetName(String petName) {
//		this.petName = petName;
//	}
//
//
//	public String getPetType() {
//		return petType;
//	}
//
//
//	public void setPetType(String petType) {
//		this.petType = petType;
//	}
//
//
//	public String getPetShortDescription() {
//		return petShortDescription;
//	}
//
//
//	public void setPetShortDescription(String petShortDescription) {
//		this.petShortDescription = petShortDescription;
//	}
//
//
//	public ViewPet getViewPetPage() {
//		return viewPetPage;
//	}
//
//
//	public void setViewPetPage(ViewPet viewPetPage) {
//		this.viewPetPage = viewPetPage;
//	}
//
//
//	public Error getErrorPage() {
//		return errorPage;
//	}
//
//
//	public void setErrorPage(Error errorPage) {
//		this.errorPage = errorPage;
//	}
//	

}
