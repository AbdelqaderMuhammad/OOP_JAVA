package Interfaces;

/**
 *  - variables in interface are final, public and static.
 *  - By default the methods are public.
 *  - We can now add default implementation for interface methods.
 *  This default implementation has special use and does not affect the intention behind interfaces.
 */


/**
 *             WHEN WE USE INTERFACES
 *          ---------------------------
 *
 *   1- If the functionality we are creating will be useful across a wide range of disparate objects, use an interface. Abstract classes should
 *   be used primarily for objects that are closely related,
 *   whereas interfaces are best suited for providing a common functionality to unrelated classes.
 *
 *   2- Interfaces are a good choice when we think that the API will not change for a while.
 *
 *   3- Interfaces are also good when we want to have something similar to multiple inheritances since we can implement multiple interfaces.
 *
 *   4- If we are designing small, concise bits of functionality, use interfaces. If we are designing large functional units, use an abstract class.
 *
 *
 */


public interface EmailServiceProvider {

    int emailsReceived = 0 ;

    void createEmailMessage();


    public default void saveDraftMessage(){
        System.out.println("Draft saved !");
    }

    static void sendEmail() {
        System.out.println("Email has been sent !");
    }

}
