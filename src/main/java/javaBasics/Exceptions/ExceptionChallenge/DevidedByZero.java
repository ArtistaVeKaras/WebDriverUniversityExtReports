package javaBasics.Exceptions.ExceptionChallenge;

public class DevidedByZero {

    public static void main(String[] args) {

        try {
            int c = 30/0;
            System.out.println(c);
            }catch(Exception e){
            System.out.println("the number is not device by Zero");
            e.printStackTrace();
        }
        finally{
            System.out.println("Division is fun");
        }
    }
}
