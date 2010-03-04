package com.fit.beans;


import java.util.List;

import com.fit.interfaces.Buy;
import com.fit.interfaces.Salesman;

public class SalesmanBean implements Salesman {
	public String name;
	public List<Buy> buy;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Buy> getBuy() {
		return buy;
	}
	public void setBuy(List<Buy> buy) {
		this.buy = buy;
	}
	
	
	

}
