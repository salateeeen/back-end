import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        // LinkedList extends AbstractSequentialList implements List,Deque, Cloneable, Serializable
        // AbstractSequentialList extends AbstractList
        LinkedList<String> names = new LinkedList<>();

        names.add("Ali");
        names.addFirst("Sultan");
        names.addLast("Omar");

        System.out.println(names);
    }
}
