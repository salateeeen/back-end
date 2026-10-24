interface MathUtil {
    /// static methods in interfaces should have a body
    // static methods in interface not inherited to override
    static int square(int number) {
        return number * number;
    }
}

public class StaticMethods {
    public static void main(java.lang.String[] args) {
        // access the interface without has a class implementation
        System.out.println(MathUtil.square(5));
    }
}
