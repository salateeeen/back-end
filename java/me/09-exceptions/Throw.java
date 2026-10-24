public class Throw {
    static void checkAge(int age) {
        if (age < 18) {
            // here we just thrown the exception
            // and when we need to call it we use try-catch blocks
            throw new IllegalArgumentException("Must be 18 or older");
        }

        System.out.println("Allowed");
    }

    public static void main(java.lang.String[] args) {
        try {
            checkAge(17);
        }catch (IllegalArgumentException e){
            System.out.println("Not Allowed");
        }

        checkAge(20);

    }
}
