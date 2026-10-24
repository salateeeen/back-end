import java.util.List;

public class FlatMap {
    public static void main(java.lang.String[] args) {

        // A list containing multiple lists of integers.
        List<List<Integer>> numbers =
                List.of(
                        List.of(1, 2),
                        List.of(3, 4)
                );

        numbers.stream()
                // flatMap converts each inner list into a stream
                // and combines all streams into one stream.
                // List::stream is equivalent to list -> list.stream().
                // Use for 2d lists to split all of them to one stream
                .flatMap(List::stream)

                // forEach consumes each element of the flattened stream.
                // System.out::println is equivalent to number -> System.out.println(number).
                .forEach(System.out::println);


    }
}