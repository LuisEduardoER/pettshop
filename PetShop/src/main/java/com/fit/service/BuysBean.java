package com.fit.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.fit.interfaces.Buy;

public class BuysBean implements Buys {
private Map<String, Buy> buys = new HashMap<String, Buy>();
	
	public Collection<Buy> retrieve() {
		return buys.values();
	}

	public Buy save(Buy buy) {
		return buys.put(buy.getId(), buy);
	}
	
	public Buy retrieveSingleBuy(String id) {
		return buys.get(id);
	}
}
