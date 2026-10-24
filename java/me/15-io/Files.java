public class Files {
    public static void main(java.lang.String[] args) throws Exception {
        java.nio.file.Path path =
                java.nio.file.Path.of("example.txt");

        java.nio.file.Files.writeString(path, "Hello Java");

        System.out.println(
                java.nio.file.Files.readString(path)
        );
    }
}
