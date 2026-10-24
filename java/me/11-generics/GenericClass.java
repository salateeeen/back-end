/// type using in the whole class
class Box<T> {
    private T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class GenericClass {
    public static void main(java.lang.String[] args) {
        Box<java.lang.String> box = new Box<>();

        box.set("Java");

        System.out.println(box.get());
    }
}
