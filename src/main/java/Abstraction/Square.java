package Abstraction;

public class Square extends Shape{

    private int side = 4;

    @Override
    public int calculatePerimeter() {
        System.out.println("The perimeter for the square is");
        return side * 4;
    }
}
