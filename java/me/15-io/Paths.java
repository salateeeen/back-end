import java.nio.file.Path;

public class Paths {
    public static void main(String[] args) {
        Path path =
                Paths.get("data", "file.txt");

        System.out.println(path);
        System.out.println(path.toAbsolutePath());
    }
}
