package com.fit.service;

import java.util.Collection;

import com.fit.interfaces.Buy;

public interface Buys {
	Buy save(Buy buy);
	Collection<Buy> retrieve();
	Buy retrieveSingleBuy(String id);

}
