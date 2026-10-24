import java.lang.reflect.Array;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};

        System.out.println(Array.toString(numbers));

        System.out.println(numbers[0]);

        numbers[1] = 99;

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Length: " + numbers.length);
    }
}
