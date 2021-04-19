package javaBasics;

public class Month {

    public static String getMonth(int month){
        switch(month){
            case 1: return "January";
            case 2: return "Febuary";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "Setember";
            case 10: return "October";
            default: return "Invalid month. Please enter a value between 1 and 1";
        }
    }

    public static String getMonth(String month){

        return month;
    }
}
