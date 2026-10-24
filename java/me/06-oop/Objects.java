class Person {
    String name;
    int age;
}

public class Objects {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "Sultan";
        person.age = 22;

        System.out.println(person.name);
        System.out.println(person.age);
    }
}
