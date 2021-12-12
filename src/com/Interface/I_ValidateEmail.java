package com.Interface;

import com.regex.UserValidationException;

@FunctionalInterface
public interface I_ValidateEmail {
	public boolean validateEmail(String email) throws UserValidationException;
}
