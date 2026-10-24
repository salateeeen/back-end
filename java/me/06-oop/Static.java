class MathUtils {
    final static double PI = 3.14159 ;
    static int square(int number) {
        return number * number;
    }
}

public class Static {
    public static void main(String[] args) {
        System.out.println(MathUtils.PI);
        System.out.println(MathUtils.square(5));
    }
}
