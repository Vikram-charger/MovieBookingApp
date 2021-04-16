package com.vikram.utils;

public class GstCalculator {
	public static int gstCalculator(int amount, int gstPercent) {
		return amount += (amount*gstPercent) / 100;
	}
	
	public static float calculateGstPercent(float originalCost, float netPrice) {
		return ((netPrice - originalCost)*100) / originalCost;
	}
}
