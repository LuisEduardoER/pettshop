package com.fit.service;

import java.util.Collection;

import com.fit.interfaces.Salesman;


public interface Salesmen {

	Salesman save(Salesman salesman);
	Collection<Salesman> retrieve();
	Salesman retrieveSingleSalesmen(String name);

}
