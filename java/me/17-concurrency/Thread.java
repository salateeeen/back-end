public class Thread {
    public static void main(java.lang.String[] args) throws Exception {
        java.lang.Thread thread = new java.lang.Thread(() -> {
            System.out.println("Running in another thread");
        });

        thread.start();
        thread.join();
    }
}
