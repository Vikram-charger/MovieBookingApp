package com.vikram.utils;

import java.time.LocalDate;

public class AgeCalculator {
	public static int calculateAge(String dateOfBirth) {
		LocalDate date_Of_Birth = LocalDate.parse(dateOfBirth);
		LocalDate currentYear = LocalDate.now();
		int year = date_Of_Birth.getYear();
		int age = currentYear.getYear() - year;
		return age;
	}
	public static boolean isSenior(int age) {
		if(age >= 60)
			return true;
		return false;
	}
}
