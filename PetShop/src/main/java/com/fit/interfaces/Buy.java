package com.fit.interfaces;



import java.util.List;

import com.fit.service.Buys;

public interface Buy {
	


	public String getId();
	public void setId(String id);
	public Costumer getCostumer();
	public void setCostumer(Costumer costumer);
	public Salesman getSalesman();
	public void setSalesman(Salesman salesman);
	public List<Pet> getPet();
	public void setJewelry(List<Pet> pet);
	public void executeBuyCreation(Salesman salesman, Costumer costumer, Pet pet, Buys buys);
	

}
