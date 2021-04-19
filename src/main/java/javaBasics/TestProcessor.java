package javaBasics;

public class TestProcessor {

    public static void main(String[] args) {
//        countWords("I love test automation university");
        reverseTheString("Hello UAT");
    }

    /**
     * Splits the string into an array by tokenizing it.
     * Counts words and prints them
     * @param text full string to be split
     */
    public static void countWords(String text){
//        var words = text.split(" ");
//        int numberOfWords = words.length;
//
//        String message = String.format("Your text contains %d words", numberOfWords);
//        System.out.println(message);
//
//        for(int i=0;i<numberOfWords; i++){
//            System.out.println(words[i]);
//        }
    }

    /**
     *Prints s String in reverse order
     * @param text String to reverse 
     */
    public static void reverseTheString(String text){
       for (int i=text.length()-1; i>=0; i--){
           System.out.print(text.charAt(i));
       }
    }
}
