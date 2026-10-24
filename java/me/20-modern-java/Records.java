record User(java.lang.String name, int age) {}

public class Records {
    public static void main(java.lang.String[] args) {
        User user = new User("Sultan", 21);

        System.out.println(user.name());
        System.out.println(user.age());
    }
}
