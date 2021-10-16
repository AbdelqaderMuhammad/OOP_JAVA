package Abstraction;

public class Dog extends Animal{

    @Override
    public String nameOfTheAnimal() {
        return this.getClass().toString();
    }
}
