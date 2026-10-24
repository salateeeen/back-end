public class BoundedTypes {

    // Bounded Type Parameter:
    // <T extends Number> restricts T to Number or any of its subclasses,
    // such as Integer, Double, Float, and Long.
    // This allows us to call methods defined in the Number class,
    // such as doubleValue().
    // To avoid use non-expected types like Boolean, string...
    static <T extends Number> double doubleValue(T value) {
        return value.doubleValue();
    }

    // Java allows "extends" and "super" in wildcard bounds,
    // but "super" cannot be used to define a named type parameter.
    //
    // Invalid syntax:
    // static <T super Integer> T superOfClass(T value) {
    //     return value;
    // }

    public static void main(java.lang.String[] args) {

        // T is inferred as Integer at run time.
        // doubleValue() converts the integer value to a double.
        System.out.println(doubleValue(10));

        // T is inferred as Double at run time.
        System.out.println(doubleValue(10.5));
    }
}