class Counter {
    private int value;

    synchronized void increment() {
        value++;
    }

    int getValue() {
        return value;
    }
}

public class Synchronization {
    public static void main(java.lang.String[] args)
            throws Exception {

        Counter counter = new Counter();

        java.lang.Thread t1 = new java.lang.Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        java.lang.Thread t2 = new java.lang.Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.getValue());
    }
}
