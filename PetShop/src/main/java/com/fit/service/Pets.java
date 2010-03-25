package com.fit.service;

import java.util.Collection;

import com.fit.interfaces.Pet;


public interface Pets {

	Pet save(Pet pet);
	
	Collection<Pet> retrive();
	
	Pet retriveSinglePet(String petName);
}
