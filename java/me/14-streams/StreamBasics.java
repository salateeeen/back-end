import java.util.List;

public class StreamBasics {
    public static void main(java.lang.String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // Stream comes from Collection interface.
        // Streams take a FunctionalInterface as parameter
        numbers.stream()
                .forEach(System.out::println);
    }
}
