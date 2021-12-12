package com.Interface;

import com.regex.UserValidationException;

@FunctionalInterface
public interface I_ValidateLastName {
	public boolean validateLastName(String lastName) throws UserValidationException;
}
