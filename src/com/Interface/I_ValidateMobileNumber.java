package com.Interface;

import com.regex.UserValidationException;

@FunctionalInterface
public interface I_ValidateMobileNumber {
	public boolean validateMobileNumber(String mobileNumber) throws UserValidationException;  
}
