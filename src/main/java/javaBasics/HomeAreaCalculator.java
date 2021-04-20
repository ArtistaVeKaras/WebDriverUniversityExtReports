package javaBasics;


public class HomeAreaCalculator {

    public static void main(String[] args) {

        /* Rectangle One
         * create an instance of a rectangle
         */

        Rectangle room1 = new Rectangle();
       room1.setWidth(25);
       room1.setLength(50);
       double areaOfRoom1 = room1.calculateArea();

        /* Rectangle Two the same as the above
         * create another instance of the Rectangle class
         */
        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room2.calculateArea();


        //Adding the two rooms together
        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Area of both rooms:" + totalArea);
    }
}
