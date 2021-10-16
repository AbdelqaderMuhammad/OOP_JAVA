package Abstraction;

public class main {

    public static void main(String[] args) {

        Square square = new Square();
        square.printShapeMessage();
        System.out.println(square.calculatePerimeter());
        ////////////////////////////////////////////////
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.calculatePerimeter());
        /////////////////////////////////////////////////
    }

}
