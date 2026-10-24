/// we need abstract modefier
abstract class Shape {
    abstract double area();

    void print() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    private double radius = 5;

    /// compile error if we not implement area()
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstractClasses {
    public static void main(java.lang.String[] args) {
        Shape shape = new Circle();

        shape.print();
        System.out.println(shape.area());
    }
}
