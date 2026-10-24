public class GenericMethod {
    // modifiers <generic> returnType functionName
    static <T> void print(T value) {
        System.out.println(value);
    }

    public static void main(java.lang.String[] args) {
        // Just call method with a type you want
        // like JavaScript, python and all dynamic languages.
        print("Java");
        print(100);
        print(true);
    }
}
