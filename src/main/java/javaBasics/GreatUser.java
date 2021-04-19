package javaBasics;

import java.util.Scanner;


public class GreatUser {

    public static void main(String[] args) {

        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        greetUser(name);

    }

    /**
     *
      * @param name User name to be provided
     */
    public static void greetUser(String name){
        System.out.println("Hi " + name);
    }
}
