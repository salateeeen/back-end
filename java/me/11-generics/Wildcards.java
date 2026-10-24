import java.util.ArrayList;
import java.util.List;

public class Wildcards {

    // ? extends Number:
    // Accepts a List whose element type is Number or any subclass of Number,
    // such as Integer, Double, or Float.
    // We use extends when we mainly need to read elements from the list
    // as Number objects.
    static void printNumbersExtends(List<? extends Number> numbers) {
        // we can write Number number because the
        // Integer, Douple can assign to var Number
        for (Number number : numbers) {
            System.out.println(number);
        }

        // We cannot safely add an Integer or Double to this list,
        // because Java does not know its exact element type.
    }

    // ? super Number:
    // Accepts a List whose element type is Number or a superclass of Number,
    // such as Object.
    // We use super when we need to add Number objects to the list.
    static void printNumbersSuper(List<? super Number> numbers) {
        // We can only read elements safely as Object,
        // because the actual element type could be Object or Number.
        // cant write Number number = Object
        for (Object number : numbers) {
            System.out.println(number);
        }

        // We can safely add Number objects to this list,
        // but we cannot safely add an arbitrary Object.
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        integers.add(10);
        integers.add(20);

        // List<Integer> is accepted because Integer extends Number.
        printNumbersExtends(integers);

        // List<Integer> cannot be passed to printNumbersSuper(),
        // because Integer is a subclass of Number, not a superclass.
        // To use ? super Number, we can pass List<Number> or List<Object>.
        List<Number> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20.5);

        printNumbersSuper(numbers);
    }
}