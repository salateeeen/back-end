import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("example.txt");

        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
    }
}
