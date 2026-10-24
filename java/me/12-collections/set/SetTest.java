import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        // Set is an interface just extend a collection
        // HashSet is a class  extends AbstractSet implements Set, Cloneable, Serializable
       Set<String> names = new HashSet<>();

        names.add("Ali");
        names.add("Ali");
        names.add("Sultan");

        System.out.println(names);
    }
}
