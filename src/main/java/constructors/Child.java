package constructors;

public class Child extends Parent{

    String name;
    int number;

    public Child() {
        System.out.println("A default constructor for child class");
    }

    public Child(String name) {
        this.name = name;
    }

    public Child(String name, int number) {
        super("Howard", "Lisa");
        this.name = name;
        this.number = number;
    }

}
