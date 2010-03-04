package com.fit.beans;



import java.util.List;

import com.fit.interfaces.Buy;
import com.fit.interfaces.Pet;

public class PetBean implements Pet{
	
	private String petName;
	private String type;
	private String shortDescription;
	private List<Buy> buy;
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public List<Buy> getBuy() {
		return buy;
	}
	public void setBuy(List<Buy> buy) {
		this.buy = buy;
	}
	
	
	

}
