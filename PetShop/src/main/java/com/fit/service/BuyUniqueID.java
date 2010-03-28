package com.fit.service;

public class BuyUniqueID {
	private static Integer buyUniqueID = 0;

	public static synchronized String getBuyUniqueID() {
		++buyUniqueID;
		return "ID: " + buyUniqueID.toString();
	}

}
