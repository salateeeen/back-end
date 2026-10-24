class AnimalPoly {
    void sound() {
        System.out.println("Animal sound");
    }
}

class DogPoly extends AnimalPoly {
    @Override
    void sound() {
        System.out.println("Woof");
    }
}

class CatPoly extends AnimalPoly {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class Polymorphism {
    /// Polymorphism:
    /// The ability of an object to take many forms.
    /// In Java, a parent class reference can refer to objects of different child classes,
    /// and overridden methods are executed based on the actual object type at runtime.
    public static void main(java.lang.String[] args) {
        AnimalPoly animal;

        animal = new DogPoly();
        animal.sound();

        animal = new CatPoly();
        animal.sound();
    }
}
