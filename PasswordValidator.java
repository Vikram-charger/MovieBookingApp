package com.vikram.utils;

public class PasswordValidator {
	public static int passWordLengthIdentifier(String passWord) {
		int length = passWord.length();
		return length;
	}
	
	public static boolean passwordLengthChecker(String passWord, int length) {
		if(passWord.length() == length) 
			return true;
		return false;
	}
	public static boolean validateLength(String password, long mobNo, int passwordLength) {
		if(String.valueOf(mobNo).length() == 10 && password.length() == passwordLength) {
			return true;
		}
		return false;
	}
}
