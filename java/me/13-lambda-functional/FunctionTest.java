import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        // Function<value, Result>
        // the lambda here is a function to implement "apply" methode inside the FunctionalInterface
        // this method take a value and return a result
        // in streams this used for Map...
        Function<String, Integer> length =
                text -> text.length();

        System.out.println(length.apply("Java"));
    }
}
