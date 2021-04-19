package javaBasics;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		
		
		System.out.println("Please your name:");
		Scanner  scanner = new Scanner(System.in);
		String name = scanner.next();
		scanner.close();
		greatUser(name);
	}

	public static void greatUser(String name) {
		System.out.println("Hi there, " + name);
	}
}
