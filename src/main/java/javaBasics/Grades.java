package javaBasics;

import java.util.Scanner;

public class Grades {

    public static int[] grades;
    public static Scanner scanner = new Scanner(System.in);

    /*
     * Create a program that allow a user to enter any
     * number of grades and provides them with their
     * average score, as well as the highest and lowest score
     */
    public static void main(String[] args){

        System.out.println("How many grades would you like to enter:");
        grades = new int[scanner.nextInt()];

        getGrades();
        System.out.println("Average: "+String.format("%.2f", calculateAverage()));
        System.out.println("Highest score was: "+getHighest());
        System.out.println("Lowest score was: "+getLowest());
    }

   public static void getGrades(){
    for(int i=0; i<grades.length; i++){
        System.out.println("Enter grades #" +(i+1));
        grades[i] = scanner.nextInt();
    }
   }

   public static int calculateSum(){
        int sum =0;
        for(int grade : grades){
            sum =sum + grade;
        }
        return sum;
   }

   public static double calculateAverage(){
        return calculateSum()/grades.length;
   }

   public static int getHighest(){
        int highest = grades[0];
        for(int grade: grades){
            if(grade > highest){
                highest = grade;
            }
        }
        return highest;
   }

    public static int getLowest(){
        int lowest = grades[0];
        for(int grade: grades){
            if(grade > lowest){
                lowest = grade;
            }
        }
        return lowest;
    }
}
