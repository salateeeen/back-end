import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        // Predicate<value>
        // the lambda here is a function to implement "test" methode inside the FunctionalInterface
        // this method take a value and return a boolean
        // in streams this used for filter...
        Predicate<String> isLong =
                text -> text.length() > 5;

        System.out.println(isLong.test("JavaScript"));
    }
}
