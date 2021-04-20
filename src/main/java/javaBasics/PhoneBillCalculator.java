package javaBasics;

import java.util.Scanner;

public class PhoneBillCalculator {

	/*
	 * Calculate a final someone phone bill
	 * Allow the operator to input the plan fee and the  number
	 * of overage minutes.
	 * */
	
		public static Scanner scanner =  new Scanner(System.in);
		static double charges = 0.25;
		static double tax = 0.15;
	
	public static void main(String[] args) {
		
		double pricePlan = usePricePlan();
		int minutesUsed = userAverageMinutes();
		calculateCharges(minutesUsed, pricePlan);
		
	}
	
	public static double usePricePlan() {
		System.out.println("Enter the base cost of your plan");
		double minutesUsed = scanner.nextDouble();
		return minutesUsed;
	}
	
	public static int userAverageMinutes() {
		System.out.println("Enter the average minutes used");
		int planFee = scanner.nextInt();
		return  planFee;
	}
	
	public static double calculateCharges( double minutesUsed, double pricePlan) {
		double chargesOver = minutesUsed*charges;
		System.out.println("Phone Bill Statement" );
		System.out.println("Plan: $" + pricePlan );
		System.out.println("Average: " + chargesOver );
		
		double taxCharges = chargesOver*tax;
		System.out.println("Tax: " + taxCharges );
		double total = pricePlan+taxCharges;
		System.out.println("Total: " +total );
		
		return chargesOver;				
	}
	public static double taxCharge(double taxCharges) {
		double charges = taxCharges*tax;
		return charges;
	}
}
