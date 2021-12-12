package com.Interface;

import com.regex.UserValidationException;

@FunctionalInterface
public interface I_ValidatePassword {
	public boolean validatePassword(String password) throws UserValidationException;
}
