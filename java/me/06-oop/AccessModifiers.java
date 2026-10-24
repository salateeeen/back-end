class UserPerson {
    private String password = "secret";

    public String getPassword() {
        return password;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        UserPerson user = new UserPerson();

        System.out.println(user.getPassword());
    }
}
