import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        // Consumer<value>
        // the lambda here is a function to implement "accept" methode inside the FunctionalInterface
        // this method take a value and perform an operation, doesn't return anything
        // in streams this used for forEach...
      Consumer<String> print =
                text -> System.out.println(text);

        print.accept("Hello Java");
    }
}
