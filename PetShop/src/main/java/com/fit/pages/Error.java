package com.fit.pages;

import org.apache.tapestry5.annotations.Persist;

public class Error {
	@Persist
	private String error;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
