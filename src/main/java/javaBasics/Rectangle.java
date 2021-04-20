package javaBasics;

public class Rectangle {

   private double length;
   private double width;

    /*
     * Constructors need to have same name as the class
     * You can create as many constructors as you want
     * ConstructorOne has no default values with no parameters
     */
   public Rectangle(){
       length = 0;
       width = 0;
   }

    /*
     * ConstructorTwo with parameters
     */
   public Rectangle(double length, double width){
       //Does the same thing
       this.length =length;
       setLength(length);
       setWidth(width);
   }

   public double getLength(){
       return length;
   }

   public void setLength(double length){
       this.length = length;
   }

   public double getWidth(){
       return width;
   }

   public void setWidth(double width){
       this.width = width;
   }

   public double  calculatePerimeter(){
       return(2 * length) + (2* width);
   }

   public double calculateArea(){
       return length * width;
   }

   public void print(){
       System.out.println("Printing nothing here");
   }
}
