package com.fit.pages;



import org.apache.tapestry5.annotations.Persist;

import com.fit.interfaces.Pet;

public class ViewPet {
	@Persist
	private Pet singlePet;

	public Pet getSinglePet() {
		return singlePet;
	}

	public void setSinglePet(Pet singlePet) {
		this.singlePet = singlePet;
	}

}
