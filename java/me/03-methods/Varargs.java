import java.util.ArrayList;
import java.util.Arrays;

public class Varargs {
    static int sum(int... numbers) {
        System.out.println("numbers are " + Arrays.toString(numbers));
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4, 5));
    }
}
