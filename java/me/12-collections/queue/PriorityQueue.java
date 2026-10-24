public class PriorityQueue {
    public static void main(java.lang.String[] args) {
        java.util.PriorityQueue<Integer> queue =
                new java.util.PriorityQueue<>();

        queue.offer(30);
        queue.offer(10);
        queue.offer(20);

        System.out.println(queue.poll());
    }
}
