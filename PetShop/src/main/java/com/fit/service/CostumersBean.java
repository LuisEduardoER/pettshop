package com.fit.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.fit.interfaces.Costumer;


public class CostumersBean implements Costumers {
private Map<String, Costumer> costumers = new HashMap<String, Costumer>();
	
	public Collection<Costumer> retrieve() {
		return costumers.values();
	}

	public Costumer save(Costumer costumer) {
		return costumers.put(costumer.getName(), costumer);
	}
	
	public Costumer retrieveSingleCostumer(String name) {
		return costumers.get(name);
}

}
