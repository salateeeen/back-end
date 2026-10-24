import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        // Supplier<Result>
        // the lambda here is a function to implement "get" methode inside the FunctionalInterface
        // this method doesn't take any value and return a result
        // in streams this used for ...
        Supplier<Double> random =
                () -> Math.random();

        System.out.println(random.get());
    }
}
