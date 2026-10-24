interface Greeting {
    // Default methods allow adding new methods to an interface
    // without forcing existing implementing classes to implement them.
    // This helps maintain backward compatibility when the interface evolves.
    // if we add new methode to the interface without default
    // then the all classes implement this interface need to implement this new methode
    // or the compile error thrown
    default void hello() {
        System.out.println("Hello!");
    }
}

public class DefaultMethods implements Greeting {
    public static void main(java.lang.String[] args) {
        new DefaultMethods().hello();
    }
}
