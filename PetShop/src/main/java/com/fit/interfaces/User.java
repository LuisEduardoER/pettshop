package com.fit.interfaces;

import com.fit.beans.Country;
import com.fit.beans.Gender;

public interface User {
	public String getUserName();

	public void setUserName(String userName);

	public String getPassword();

	public void setPassword(String password);

	public Gender getGender();

	public void setGender(Gender gender);

	public boolean isSubscribe();

	public void setSubscribe(boolean subscribe);

	public String getEmail();

	public void setEmail(String email);

	public Country getCountry();

	public void setCountry(Country country);

	public double getAge();

	public void setAge(double age);

}
