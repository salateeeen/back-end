public class TypeCasting {
    public static void main(String[] args) {
        // Widening: smaller type -> larger type
        // implicit
        int number = 10;
        double decimal = number;

        System.out.println(decimal);

        // Narrowing: larger type -> smaller type
        // explicit
        double price = 100.99;
        int roundedDown = (int) price;

        System.out.println(roundedDown);
    }
}
