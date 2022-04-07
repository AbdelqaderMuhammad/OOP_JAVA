package Abstraction;

public abstract class Shape {

    /**
     * We cannot instantiate an object from an abstract class.
     * We can get different methods either abstracted or even implemented.
     *  - Abstract methods should be in an abstracted classes.
     *  - Abstract methods has to be overridden.
     *  - Abstract methods do not have a body.
     */

    /**
     *      WHEN WE USE AN ABSTRACTION
     *      --------------------------
     *
     *      1- An abstract class is also good if we want to declare non-public members. In an interface, all methods must be public.
     *
     *      2- If we want to add new methods in the future, then an abstract class is a better choice. Because if we add new methods to an interface,
     *      then all of the classes that already implemented that interface will have to be changed to implement the new methods.
     *
     *      3- If we want to create multiple versions of our component, create an abstract class. Abstract classes provide a
     *      simple and easy way to version our components. By updating the base class, all inheriting classes are automatically
     *      updated with the change. Interfaces, on the other hand, cannot be changed once created.
     *      If a new version of an interface is required, we must create a whole new interface.
     *
     */

    // i can see it through the inheritance.
    protected int val ;


    public final void printShapeMessage() {
        System.out.println("A shape class has been inherited.");
    }

    public abstract int calculatePerimeter();


}
