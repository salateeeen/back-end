class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class Inheritance {
    public static void main(java.lang.String[] args) {
        Animal animal = new Dog();

        animal.eat();
        // error we cant access methods inside children from parent reference
        // uses in interfaces where almost the entire methods in the interface
        // animal.bark();

        // error we cant reference the parent from children
        // Dog dog = new Animal();

        Animal animal2 = new Animal();
        /// downcasting
        Dog dog = (Dog)animal2;
        dog.bark();
    }
}
