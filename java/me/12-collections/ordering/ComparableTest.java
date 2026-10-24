import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Implement Comparable<Student> the genericInterface with the specific type.
// We need to implement this interface when we need to use
// sort, search methods and so on.
class Student implements Comparable<Student> {
    int age;

    Student(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        // Integer.compare(x, y);
        // x >= y return 1
        // x = y return 0
        // x < y return -1
        return Integer.compare(this.age, other.age);
    }
}

public class ComparableTest {
     static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(25));
        students.add(new Student(20));

        // Collections.sort passes any object implements Comparable<Student>
        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student.age);
        }
    }
}