package com.fit.interfaces;



import java.util.List;

public interface Pet {
	
	public String getPetName();
	public void setPetName(String petName);
	public String getType();
	public void setType(String type);
	public String getShortDescription();
	public void setShortDescription(String shortDescription);
	public List<Buy> getBuy();
	public void setBuy(List<Buy> buy);

}
