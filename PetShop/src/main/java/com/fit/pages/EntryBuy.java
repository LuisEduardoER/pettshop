package com.fit.pages;

import java.util.Collection;

import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.ioc.annotations.Inject;

import com.fit.beans.BuyBean;
import com.fit.interfaces.Buy;

import com.fit.interfaces.Costumer;
import com.fit.interfaces.Pet;
import com.fit.interfaces.Salesman;
import com.fit.interfaces.User;
import com.fit.service.Buys;
import com.fit.service.Costumers;
import com.fit.service.Pets;

import com.fit.service.Salesmen;

public class EntryBuy {
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
	@Persist
	private String buyCostumer;
	@Persist
	private String buySalesman;
	@Persist
	private String buyPet;
	
	private ViewBuy viewBuyPage;
	@InjectPage
	private ViewError viewErrorPage;

	@Inject
	private Pets pets;
	@Inject
	private Costumers costumers;
	@Inject
	private Salesmen salesmen;
	@Inject
	private Buys buys;
	
	public Collection<Pet> getPets() {
		return pets.retrive();
	}

	public Collection<Costumer> getCostumers() {
		return costumers.retrieve();
	}

	public Collection<Salesman> geSalesmen() {
		return salesmen.retrieve();
	}

	@OnEvent(value = "submit", component = "buyInputForm")
	Object onFromSubmit() {

		Pet pet = null;
		Costumer costumer = null;
		Salesman salesman = null;

		try {
			costumer = costumers.retrieveSingleCostumer(getBuyCostumer());
			salesman= salesmen
					.retrieveSingleSalesmen(getBuySalesman());
			pet = pets.retriveSinglePet(getBuyPet());
		} catch (Exception ex) {
			viewErrorPage.setPassedMessage(ex.toString());
			return viewErrorPage;
		}

		Buy buyBean = new BuyBean();
		buyBean.executeBuyCreation(salesman,costumer, pet, buys);

		this.buyPet = "";
		this.buySalesman = "";
		this.buyCostumer = "";
		
		return viewBuyPage;
	}
	
	public String getBuyCostumer() {
		return buyCostumer;
	}

	public void setBuyCostumer(String buyCostumer) {
		this.buyCostumer = buyCostumer;
	}

	public String getBuySalesman() {
		return buySalesman;
	}

	public void setBuySalesman(String buySalesman) {
		this.buySalesman = buySalesman;
	}

	public String getBuyPet() {
		return buyPet;
	}

	public void setBuyPet(String buyPet) {
		this.buyPet = buyPet;
	}

}
