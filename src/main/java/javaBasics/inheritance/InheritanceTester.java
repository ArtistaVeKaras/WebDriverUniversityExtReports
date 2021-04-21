package javaBasics.inheritance;

import javaBasics.Rectangle;
import javaBasics.chapter9.Square;

public class InheritanceTester {


    public static void main(String[] args) {

        Mother mother = new Mother();
        mother.setName("Glender");

        System.out.println(mother.getName() + " " + "is a " +  mother.getGender());
        testSquareOverride();
        Rectangle res = new Rectangle();
        res.print();

        Square squared = new Square();
        squared.print("Override the methods");
     }

     public static void testSquareOverride(){
        Rectangle res = new Rectangle();
        res.setLength(4);
        res.setWidth(8);
         System.out.println(res.calculatePerimeter());

         Square squared = new Square();
         squared.setLength(4);
         squared.setWidth(8);
         System.out.println(squared.calculatePerimeter());
     }


    }

