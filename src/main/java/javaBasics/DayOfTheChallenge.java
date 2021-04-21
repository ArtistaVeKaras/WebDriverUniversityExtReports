package javaBasics;


import java.util.Scanner;

public class DayOfTheChallenge {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        weekOfTheDay();

    }

    public static void weekOfTheDay() {
        String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Please enter the day of the week: ");
        int day = scanner.nextInt();
        scanner.close();

        String message;

        switch (day){
            case 1 :
               message = "Monday";
                break;
            case 2:
                message = "Tuesday";
                break;
          }
        }
    }
