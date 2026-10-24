import java.util.List;

public class Filter {
    public static void main(java.lang.String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        // Implementation of predicate interface.
        // filter((a)=>{return boolean})
        // filter return a new stream.
        // System.out::println > method references out(new);
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
