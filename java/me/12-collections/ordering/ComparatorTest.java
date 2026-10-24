import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Ali", 25));
        people.add(new Person("Sultan", 20));
        people.add(new Person("omar", 36));

        // Here we can use sort directly in people object
        // without Implements Comparable
        people.sort(Comparator.comparingInt(p -> p.age));

        for (Person person : people) {
            System.out.println(person.name);
        }
    }
}