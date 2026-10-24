public class Deque {
    public static void main(java.lang.String[] args) {
        // Deque is an interface extends  Queue, SequencedCollection interfaces
        // SequencedCollection extends Collection interface
        // Collection extends Iterable interface
        java.util.Deque<java.lang.String> deque =
                new java.util.ArrayDeque<>();

        deque.addFirst("A");
        deque.addLast("B");
        deque.add("C");
        String top= deque.element();

        System.out.println(deque);
        System.out.println(top);
    }
}
