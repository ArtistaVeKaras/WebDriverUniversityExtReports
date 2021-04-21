package javaBasics.abstraction;

public class Rectangle extends Shape{

    private double length;
    private double weight;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Rectangle(double length, double weight){
        setLength(length);
        setWeight(weight);
    }

    @Override
    double calculateArea() {
        return length * weight;
    }
}
