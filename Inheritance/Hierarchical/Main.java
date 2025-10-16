package Inheritance.Hierarchical;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run();

        Car car = new Car();
        car.run();

        Bike bike = new Bike();
        bike.run();
    }
}
