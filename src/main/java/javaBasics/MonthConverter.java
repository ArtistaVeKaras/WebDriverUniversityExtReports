package javaBasics;

public class MonthConverter {

    public static void main(String[] args) {

        /*
         * Month class can be instantiate because the classes
         * are static
         */
        System.out.println(Month.getMonth("April"));
        System.out.println(Month.getMonth(3));
    }
}
