import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // ArrayList extends AbstractList implements List, RandomAccess, Cloneable, Serializable
        ArrayList<String> names = new ArrayList<>();

        names.add("Ali");
        names.add("Sultan");

        System.out.println(names.get(0));
        System.out.println(names.size());
    }
}
