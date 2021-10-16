package inheritance;

public class Lion extends Animal {


    public void setProperties(int age, String name) {
        setAge(age);
        super.name = name ;
    }
}
