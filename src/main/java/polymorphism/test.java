package polymorphism;

public class test {

    public static void main(String[] args) {
        Vehicle vec = new Vehicle();
        vec.move();
        vec.breakDown();
        ////////////////////////////////////
        vec = new Boat();
        vec.move();
        vec.breakDown();
    }

}
