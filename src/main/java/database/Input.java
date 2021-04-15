package database;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {

public static String getInput(String value){

    //Stream reader and print the value
    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(value);
    System.out.flush();

    try {
        return buffer.readLine();
       }catch (Exception e){
        return "Error" +e.getMessage();
    }
}
    public static int getInt(String value)throws  NumberFormatException{
        String n = getInput(value);
        return  Integer.parseInt(n);
    }
}
