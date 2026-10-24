// A sealed interface restricts which classes can implement it.
sealed interface Shape permits Circle, Rectangle {}

// A permitted implementation must be final, sealed, or non-sealed.
final class Circle implements Shape {}

// A final class cannot be extended by other classes.
final class Rectangle implements Shape {}

public class SealedClasses {
    public static void main(String[] args) {

        // A Shape reference can hold an instance of any permitted implementation.
        Shape shape = new Circle();

        // Print the object's string representation.
        System.out.println(shape);
    }
}