package com.fit.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fit.interfaces.Buy;
import com.fit.interfaces.Salesman;

public class SalesmenBean implements Salesmen{
	private Map<String, Salesman> salesmen = new HashMap<String, Salesman>();

	public Collection<Salesman> retrieve() {
		return salesmen.values();
	}
	
	public Salesman save(Salesman salesman) {
		return salesmen.put(salesman.getName(),salesman);
	}

	public Salesman retrieveSingleSalesmen(String name) {
		return salesmen.get(name);
	}

	public List<Buy> getBuy() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setBuy(List<Buy> buy) {
		// TODO Auto-generated method stub
		
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

}
