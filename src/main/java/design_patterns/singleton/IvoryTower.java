package design_patterns.singleton;

/**
 * Singleton class. Eagerly initialized static instance guarantees thread safety.
 *
 * eager loading is the concept in which we create object before its demand. Like in some parties we see that on reception
 * there are already water filled glasses are available. They fill glass with water in advance before relatives come and serve them those already available glasses of water.
 */

public final class IvoryTower {
    /**
     * Static to class instance of the class.
     */
    private static final IvoryTower INSTANCE = new IvoryTower();

    /**
     * Private constructor so nobody can instantiate the class.
     */
    private IvoryTower() {
    }

    /**
     * Factory method
     * To be called by user to obtain instance of the class.
     * @return instance of the singleton.
     */
    public static IvoryTower getInstance(){
        return INSTANCE;
    }

}
