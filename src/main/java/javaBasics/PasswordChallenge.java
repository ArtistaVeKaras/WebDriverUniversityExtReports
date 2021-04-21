package javaBasics;

import java.util.Scanner;

public class PasswordChallenge {

    private static final Scanner scanner = new Scanner(System.in);
    private static final int REQUIREDPASSWORDLENGTH = 8;
    private static final String OLDPASSWORD = "mynewpassword";
    private static final String USERNAME = "test";

    public static void main(String[] args){

        System.out.println("Please enter a new password");
        String proposedPassword = scanner.nextLine();

      validatePassword(proposedPassword);
   }

   public static void validatePassword(String password) {

       var currentPassword = new StringBuilder(password);

       for (int i = 0; i < currentPassword.length(); i++) {
           char curr = currentPassword.charAt(i);

           if (Character.isUpperCase(curr) && curr>=REQUIREDPASSWORDLENGTH) {
               System.out.println("Valid");
           }else{
               System.out.println("Invalid");
           }
       }
   }
}