public class ExecutorService {
    public static void main(java.lang.String[] args) {
        java.util.concurrent.ExecutorService executor =
                java.util.concurrent.Executors.newFixedThreadPool(2);

        executor.submit(() -> System.out.println("Task 1"));
        executor.submit(() -> System.out.println("Task 2"));

        executor.shutdown();
    }
}
