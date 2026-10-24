interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

/// we cant extend multible classes but
/// we can implements multible interfaces
public class MultipleInterfaces implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void swim() {
        System.out.println("Swimming");
    }

    public static void main(java.lang.String[] args) {
        MultipleInterfaces obj = new MultipleInterfaces();

        obj.fly();
        obj.swim();

        // error because the Flyable interface doesnt have a swim methode
       // Flyable obj = new MultipleInterfaces();
       // obj.swim();

    }
}
