package com.fit.service;

import java.util.Collection;

import com.fit.interfaces.Costumer;




public interface Costumers {

	Costumer save(Costumer costumer);
	Collection<Costumer> retrieve();
	Costumer retrieveSingleCostumer(String name);
}
