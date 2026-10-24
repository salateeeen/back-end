public class MultipleCatch {
    public static void main(java.lang.String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
    }
}
