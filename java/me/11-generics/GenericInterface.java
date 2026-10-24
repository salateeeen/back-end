interface Container<T> {
    void set(T value);
    T get();
}

// we implement the interface with the specific type in genericInterface
class StringContainer implements Container<String> {
    private String value;

    public void set(String value) {
        this.value = value;
    }

    public String get() {
        return value;
    }
}

public class GenericInterface {
    public static void main(String[] args) {
        StringContainer container = new StringContainer();

        container.set("Hello");

        System.out.println(container.get());
    }
}
