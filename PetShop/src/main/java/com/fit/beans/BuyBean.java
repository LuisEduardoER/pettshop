package com.fit.beans;



import java.util.List;

import com.fit.interfaces.Buy;
import com.fit.interfaces.Pet;

public class BuyBean implements Buy{
	
	public String id;
	public String customer;
	public String salesman;
	public List<Pet> pet;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getSalesman() {
		return salesman;
	}
	public void setSalesman(String salesman) {
		this.salesman = salesman;
	}
	public List<Pet> getPet() {
		return pet;
	}
	public void setPet(List<Pet> pet) {
		this.pet = pet;
	}
	

}
