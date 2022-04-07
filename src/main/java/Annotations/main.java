package Annotations;

public class main {
    public static void main(String[] args) {
        Car c = new Car("Ford", "F150", "2018");
        JsonSerializer jsonSerializer = new JsonSerializer();
        String serialize = jsonSerializer.serialize(c);
        System.out.println(serialize);
    }
}
