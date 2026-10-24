@FunctionalInterface
interface Operation {
    int calculate(int a, int b);
}

public class FunctionalInterfaces {
    public static void main(java.lang.String[] args) {
        // This just for create a new instance of interface with the implementation.
        Operation calculater ;
        // We can change the implementation in run time.
        // Behind the scene this creates to objects.
        calculater= (a, b) -> a + b;
        System.out.println(calculater.calculate(5, 3));
        calculater = (a, b) -> a - b;
        System.out.println(calculater.calculate(5, 3));
    }
}
