class User {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Constructors {
    public static void main(String[] args) {
        User user = new User("Sultan", 22);

        System.out.println(user.name);
        System.out.println(user.age);
    }
}
