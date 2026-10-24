class Car {
    // default null
    String model;

    void drive() {
        System.out.println(model + " is driving");
    }
}

public class Classes {
    public static void main(String[] args) {
        Car car = new Car();

        car.drive();
        car.model = "BMW";
    }
}
