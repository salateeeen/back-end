import java.util.List;

public class Map {
    public static void main(java.lang.String[] args) {
        List<Integer> numbers = List.of(1, 2, 3);

        // Implementation of Function interface.
        // map((a)=>{return Function(a)})
        // map return a new stream.
        // System.out::println > method references out(new);
        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
}
