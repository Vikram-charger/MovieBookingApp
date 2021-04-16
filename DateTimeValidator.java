package com.vikram.utils;

import java.time.LocalDate;

public class DateTimeValidator {
	public static boolean checkDate(LocalDate rideDate) {
		LocalDate currentDate = LocalDate.now();
		if (rideDate.isAfter(currentDate) || rideDate.equals(currentDate))
			return true;
		return false;
	}
}
