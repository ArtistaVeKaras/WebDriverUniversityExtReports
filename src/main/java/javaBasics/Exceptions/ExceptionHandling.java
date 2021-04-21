package javaBasics.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) throws IOException {

        createNewFile();
        numberExceptionHandling();
        createNewFileRethrow();
    }

    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        }catch(IOException e){
            System.out.println("Directory does not exit");
            e.printStackTrace();
        }
    }

    public static void createNewFileRethrow() throws IOException {
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }

    public static void numberExceptionHandling(){
        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);

            while (fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
            //catch two exceptions in a single line of code as oppose to include 2 catch blocks
        }catch(FileNotFoundException | InputMismatchException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
        finally{
            fileReader.close();
            }
    }
}
