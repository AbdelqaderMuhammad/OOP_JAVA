package overloading;

public class main {

    public static void main(String[] args) {
        Sum summation = new Sum();
        System.out.println(summation.sum(4.2 , 3.1));
        summation.sum();
    }

}
