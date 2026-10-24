import java.util.List;

public class Reduce {
    public static void main(java.lang.String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);

        int sum = numbers.stream()
                // Implementation of BinaryFunction interface.
                // reduce(initialValue, (a,b)=>{return BinaryFunction(a,b)})
                // reduce return a one value.
                // Integer::sum > method references sum = (a, b) => a+b;
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
