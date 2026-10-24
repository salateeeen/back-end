import java.io.IOException;

public class Throws {

    // The 'throws' keyword declares that this method may throw an IOException.
    // Because IOException is a "checked exception", Java requires us to either
    // handle it using try-catch inside this method or declare it using 'throws'.
    // Using 'throws' allows the caller to decide how to handle the exception.

    static void readFile() throws IOException {
        // 'throw' actually throws the exception when this line executes.
        // if we don't have throws IOException compile error
        // some methods has a throw implicitly inside them
        throw new IOException("File error");
    }

    public static void main(java.lang.String[] args) {
        // Since readFile() declares IOException using 'throws',
        // the caller must handle it using try-catch or declare it using 'throws' too.
        try {
            readFile();
        } catch (IOException e) {
            // Handle the exception by printing its error message.
            System.out.println(e.getMessage());
        }
    }
}