public class Runnable {
    public static void main(java.lang.String[] args) throws Exception {
        java.lang.Runnable task = () ->
                System.out.println("Task running");

        java.lang.Thread thread = new java.lang.Thread(task);

        thread.start();
        thread.join();
    }
}
