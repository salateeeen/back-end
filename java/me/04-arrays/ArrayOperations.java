import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1};

        // create stream using Arrays.stream()
        Arrays.stream(numbers).forEach(System.out::println);
        // sort and change the array itself
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        int index = Arrays.binarySearch(numbers, 5);

        System.out.println("Index: " + index);
    }
}
