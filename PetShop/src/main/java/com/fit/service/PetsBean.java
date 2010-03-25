package com.fit.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.fit.interfaces.Pet;



public class PetsBean implements Pets {
private Map<String, Pet> pets = new HashMap<String, Pet>();
	


	public Collection<Pet> retrive() {
				return pets.values();
	}

	public Pet retriveSinglePet(String petName) {
		 return pets.get(petName);
	}

	public Pet save(Pet pet) {
		return pets.put(pet.getPetName(), pet);
	}
}
