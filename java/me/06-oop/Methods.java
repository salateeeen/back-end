class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

public class Methods {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(10, 20));
    }
}
