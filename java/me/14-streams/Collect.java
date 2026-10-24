import java.util.List;
import java.util.stream.Collectors;

public class Collect {
    public static void main(java.lang.String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);

        // collect to create Collection from stream.
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
