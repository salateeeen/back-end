public class Final {

    // here we cant override this method from any inheret class
    final int add(int num1, int num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        /// as const to not change the value
        final double PI = 3.14159;
        // PI = 4; // Compile error

        System.out.println(PI);

    }
}

final class FinalClass {
    boolean finalClassCantInherted;
    FinalClass() {
        this.finalClassCantInherted = true;
    }
}

//class ThisMakeAnError extends FinalClass {}
