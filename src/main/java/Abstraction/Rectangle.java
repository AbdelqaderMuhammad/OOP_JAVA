package Abstraction;

public class Rectangle extends Shape {

    private int width = 2;
    private int length = 5;

    @Override
    public int calculatePerimeter() {
        System.out.println("The perimeter for the rectangle is");
        return (width*2) + (length*2);
    }
}
