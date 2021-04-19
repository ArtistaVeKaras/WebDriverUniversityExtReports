package javaBasics.javaBasicTwo.abstraction;

public class ShapeTester {

    public static void main(String[] args) {

        Shape rect = new Rectangle(4, 7);
        rect.print();
        System.out.println(rect.calculateArea());
    }
}
