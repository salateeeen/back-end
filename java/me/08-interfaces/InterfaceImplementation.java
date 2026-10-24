interface Vehicle {
    void start();
}

public class InterfaceImplementation implements Vehicle {
    @Override
    public void start() {
        System.out.println("Vehicle started");
    }

    public static void main(java.lang.String[] args) {
        /// in implements the convintional to use the interface as ref var
        Vehicle vehicle = new InterfaceImplementation();
        vehicle.start();
    }
}
