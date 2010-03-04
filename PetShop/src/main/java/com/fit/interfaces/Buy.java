package com.fit.interfaces;



import java.util.List;

public interface Buy {
	

	public String getId();
	public void setId(String id);
	public String getCustomer();
	public void setCustomer(String customer);
	public String getSalesman();
	public void setSalesman(String salesman);
	public List<Pet> getPet();
	public void setPet(List<Pet>pet);
	

}
