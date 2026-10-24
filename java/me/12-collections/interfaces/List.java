import java.util.ArrayList;

public class List {
    public static void main(java.lang.String[] args) {
        // List extends SequencedCollection interfaces
        // SequencedCollection extends Collection interface
        // Collection extends Iterable interface
        java.util.List<java.lang.String> names = new ArrayList<>();

        names.add("Ali");
        names.add("Sultan");
        names.add("Omar");

        System.out.println(names);
    }
}
