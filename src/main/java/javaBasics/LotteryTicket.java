package javaBasics;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    public static final int LENGTH = 12;
    public static final int MAX_TICKET_NUMBER = 80;

    public static void main(String[] args) {

        int[] ticket = generateNumbers();
        Arrays.sort(ticket); //this sorts the array
        printTicket(ticket);
    }

    /*
    * this method generates a random method
    * */
    public static int[] generateNumbers(){

        int[] ticket = new int[LENGTH];

         Random random = new Random();

         for(int i=0; i<LENGTH; i++){
             int randomNumber;

             /*Generate random then search to make sure it doesn't
             already exist in the array. If it does, regenerate and search again.
             * */
             do {
                 randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
             }while(search(ticket, randomNumber));

             ticket[i] = randomNumber;
         }
         return ticket;
    }

    /*
     * this prints the ticket number
     */
    public static void printTicket(int ticket[]){
        for(int i=0; i<LENGTH; i++){
            System.out.print(ticket[i] + " ");
        }
    }

    /**
     * does a sequential search on the array to find the value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if sound, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor){

        /**This is enhanced loop.
         *It iterates through 'array' and
         * each time assigns the current element to 'value'
         */
        for (int  value : array){
            if(value == numberToSearchFor){
                return true;
            }
        }

        /*If we've reached this point, then the entire array was searched
        and the value was  not found
        * */
        return false;
    }
}
