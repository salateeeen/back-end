public class Queue {
    public static void main(java.lang.String[] args) {

        // Queue is an interface that represents a collection
        // designed for processing elements, typically using FIFO
        // (First In, First Out): the first element added is the first removed.
        //
        // LinkedList "implements" Queue, so we can use it
        // as the concrete implementation of this interface.
        // interface = implementation (WE CAN DO THIS)
        java.util.Queue<String> queue =
                new java.util.LinkedList<>();

        // offer() adds an element to the end of the queue.
        queue.offer("A");
        queue.offer("B");

        // poll() removes and returns the element at the front.
        // Returns null if the queue is empty.
        System.out.println(queue.poll()); // A

        // Prints the remaining elements.
        // A was removed, so only B remains.
        System.out.println(queue); // [B]
    }
}
