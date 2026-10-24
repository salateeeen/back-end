import java.util.function.Predicate;

class AllowedAge implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer >= 18;
    }
}

public class Lambda {
    public static void main(String[] args) {

       AllowedAge allowedAge = new AllowedAge();
       Predicate<String> moreThan8chars = new Predicate<String>() {
           @Override
           public boolean test(String s) {
               return s.length()>8;
           }
       };

       Predicate<Integer> isEven =
                number -> number % 2 == 0;

        System.out.println(isEven.test(10));
        System.out.println(moreThan8chars.test("sultan"));
        System.out.println(allowedAge.test(18));
    }
}
