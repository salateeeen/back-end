class Counter {
    int value;
}

public class Fields {
    public static void main(String[] args) {
        Counter counter = new Counter();

        counter.value = 10;
        counter.value++;

        System.out.println(counter.value);
    }
}
