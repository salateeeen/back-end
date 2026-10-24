import java.io.IOException;

public class CheckedUnchecked {
    public static void main(java.lang.String[] args) {

        // Checked Exception:
        // All non RuntimeException
        // Checked exceptions are checked by the compiler.
        // They must be caught using try-catch or declared using throws.

        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("Checked exception");
        }

        // Unchecked Exception:
        // RunTimeException and all other subclasses of it
        // Unchecked exceptions are not checked by the compiler.
        // They occur at runtime and do not require explicit handling
        // using try-catch or declaration with throws.

        try {
            // Throws ArithmeticException at runtime.
            int result = 10 / 0;
            System.out.println(result);
        } catch (RuntimeException e) {
            System.out.println("Runtime exception");
        }
    }
}