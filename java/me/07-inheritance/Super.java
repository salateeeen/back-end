class Parent {
    String name = "Parent";

    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    String name = "Child";

    void display() {
        System.out.println(this.name);
        System.out.println(super.name);

        super.show();
    }
}

public class Super {
    public static void main(String[] args) {
        new Child().display();
    }
}
