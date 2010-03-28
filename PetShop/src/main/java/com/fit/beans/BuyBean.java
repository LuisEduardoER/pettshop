package com.fit.beans;

import java.util.LinkedList;

import com.fit.interfaces.*;

import java.util.List;

import com.fit.interfaces.Buy;

import com.fit.interfaces.Costumer;

import com.fit.interfaces.Pet;
import com.fit.interfaces.Salesman;
import com.fit.service.BuyUniqueID;
import com.fit.service.Buys;

public class BuyBean implements Buy {
	public String id;
	public Costumer costumer;
	public Salesman salesman;
	public List<Pet> pet;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Costumer getCostumer() {
		return costumer;
	}

	public void setCostumer(Costumer costumer) {
		this.costumer = costumer;
	}

	public Salesman getSalesman() {
		return salesman;
	}

	public void setSalesman(Salesman salesman) {
		this.salesman = salesman;
	}

	public List<Pet> getPet() {
		return pet;
	}

	public void setPet(List<Pet> pet) {
		this.pet = pet;
	}

	public void executeBuyCreation(Salesman salesman, Costumer customer,
			Pet pet, Buys buys) {

		this.setId(BuyUniqueID.getBuyUniqueID());
		this.setSalesman(salesman);
		this.setCostumer(customer);

		List<Pet> l = new LinkedList<Pet>();
		l.add(pet);

		this.setPet(l);

		customer.getBuy().add(this);
		pet.getBuy().add(this);
		customer.getBuy().add(this);

		buys.save(this);
	}

	public void setJewelry(List<Pet> pet) {
		// TODO Auto-generated method stub
		
	}

}
