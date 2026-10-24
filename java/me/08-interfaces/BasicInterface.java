interface Printable {
    static int square(int number) {
        return number * number;
    }
    void print();
}

// we implements the iterface not extends them
public class BasicInterface implements Printable {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    // static methods in interface not inherted to override
    // @Override
    // here we create a new function not override the one in BasicInterface
     static int square(int number) {
        return number + number;
     }

    public static void main(java.lang.String[] args) {
        System.out.println(BasicInterface.square(4));
        new BasicInterface().print();
    }
}
