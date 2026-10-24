class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student name: " + name;
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Sultan"),
            new Student("Ali"),
            new Student("Ahmad")
        };

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
