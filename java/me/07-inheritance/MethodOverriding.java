class AnimalOverride {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends AnimalOverride {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class MethodOverriding {
    public static void main(java.lang.String[] args) {
        Cat cat = new Cat();
        cat.sound();
    }
}
