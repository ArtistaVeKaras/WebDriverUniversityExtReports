package javaBasics;

public class TestProcessor {

    public static void main(String[] args) {
        countWords("I love test automation university");
        reverseTheString("camel");
        addSpaces("HelloWoldClaudioHere!");
    }

    /**
     * Splits the string into an array by tokenizing it.
     * Counts words and prints them
     * @param text full string to be split
     */
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);

        for(int i=0;i<numberOfWords; i++){
            System.out.println(words[i]);
        }
    }

    /**
     * Prints s String in reverse order
     * @param text Prints the String in reverse
     */
    public static void reverseTheString(String text){
       for (int i=text.length()-1; i>=0; i--){
           System.out.print(text.charAt(i));
       }
    }

    /*
    * Adds spaces to a jumbled String where all words are written
    * together with no spaces. Each new word begins with a
    * capital letter.
    * */
    public static void addSpaces(String text){

        var modifiedText = new StringBuilder(text);

        for(int i=0; i<modifiedText.length(); i++){
            if (i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.print(" ");
        System.out.println(modifiedText);
    }
}
