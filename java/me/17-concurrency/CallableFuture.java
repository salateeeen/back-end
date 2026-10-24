public class CallableFuture {
    public static void main(java.lang.String[] args)
            throws Exception {

        java.util.concurrent.ExecutorService executor =
                java.util.concurrent.Executors.newSingleThreadExecutor();

        java.util.concurrent.Future<Integer> future =
                executor.submit(() -> 10 + 20);

        System.out.println(future.get());

        executor.shutdown();
    }
}
