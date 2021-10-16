package constructors;

public class Parent {

    String fatherName = "John";
    String motherName = "Lisa";

    public Parent() {
        System.out.println("A default constructor of parent class");
    }

    public Parent(String fatherName, String motherName) {
        this.fatherName = fatherName;
        this.motherName = motherName;
    }
}
