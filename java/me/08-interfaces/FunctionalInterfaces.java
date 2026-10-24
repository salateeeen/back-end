@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

// implements the interface on fly without class implementation
public class FunctionalInterfaces {
    public static void main(String[] args) {
        // Lambda expression: implementation of the interface's single abstract method
        Calculator add = (a, b) -> a + b;

        // Anonymous class: another way to implement the interface
        Calculator add2 = new Calculator() {
            @Override
            // it should be public because methods in interfaces as default public
            // and we cant reduce this accessibility in our implementation
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        System.out.println(add.calculate(5, 3));
        System.out.println(add2.calculate(5, 3));
    }
}
