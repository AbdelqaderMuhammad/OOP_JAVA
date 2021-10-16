package polymorphism;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicle = {new Car(), new Bicycle(), new Boat()};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a vehicle: ");
        System.out.print("1- Car 2- Bicycle 3- Boat :: ");
        int choice = scanner.nextInt();
        vehicle[choice - 1].move();

    }
}
