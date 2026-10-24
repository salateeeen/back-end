import java.util.List;

public class MethodReferences {
    public static void main(String[] args) {
        List<String> names =
                List.of("Ali", "Sultan", "Omar");
        // Method Reference: A shorthand for a Lambda Expression that references an existing method.
        // Prints each name; equivalent to names.forEach(name -> System.out.println(name)).
        // forEach from Iterable interface and the Collection interface extends it.
        names.forEach(System.out::println);
    }
}
