package com.regex;

public class UserValidationException extends Exception{
	public ExpectedType type;
	
	public enum ExpectedType{
		FIRSTNAME,LASTNAME,MOBILENUMBER,EMAIL,PASSWORD
	}

	public UserValidationException(String message,ExpectedType type) {
		super(message);
		this.type = type;
	}
	
}
