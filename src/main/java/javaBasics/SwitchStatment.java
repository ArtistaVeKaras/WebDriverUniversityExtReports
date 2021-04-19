package javaBasics;

import java.util.Scanner;

public class SwitchStatment {

	public static void main(String[] args) {
		
		System.out.println("Please enter your grade:");
		Scanner scanner = new Scanner(System.in);
		String grade = scanner.next();
		scanner.close();
		
		String message;
		
		switch(grade) {
		case "A" :
			message = "Excelent Job";
			break;
		
		case "B":
			message = "Great Job";
			break;
			
		case "C":
			message = "Goog Job";
			break;
			
		case "D":
			message = "Needs improvements";
			break;
			
		default:
				message = "Error Invalid grade";
			break;
		}
		System.out.println(message); 
	}
}
