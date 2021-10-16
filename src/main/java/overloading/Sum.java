package overloading;

public class Sum {

    /**
     * Overloading allows different methods to have the same name,
     * but different signatures where the signature can differ by the number of
     * input parameters or type of input parameters or both.
     *
     * We can have two ore more static methods with same name, but differences in input parameters
     */

    public int sum(int x, int y) {
        return (x + y);
    }

    public double sum(double x, double y) {
        return x + y;
    }

    public void sum () {

    }

}
