package encapsulation;

/**
 * Advantages of Encapsulation:
 * ------------------------------
 * Data Hiding: The user will have no idea about the inner implementation of the class. It will not be visible to the user
 * how the class is storing values in the variables. The user will only know that we are passing the values to a setter
 * method and variables are getting initialized with that value.
 *
 * Increased Flexibility: We can make the variables of the class as read-only or write-know that only depending on our requirement.
 * If we wish to make the variables read-only then we have to omit the setter methods like setName(), setAge(), etc.
 * if we wish to make the variables as write-only then we have to omit the get methods like getName(), getAge(), etc.
 *
 * Re-usability: Encapsulation also improves the re-usability and easy to change with new requirements.
 *
 * Testing code is easy: Encapsulated code is easy to test for unit testing.
 */


public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
