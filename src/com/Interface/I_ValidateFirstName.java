package com.Interface;

import com.regex.UserValidationException;

@FunctionalInterface
public interface I_ValidateFirstName {
	public boolean validateFirstName(String firstName) throws UserValidationException;
}
