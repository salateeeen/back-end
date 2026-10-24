// Enum representing planets, where each planet has its own mass.
enum Planet {
    // Each constant calls the constructor and passes its mass as an argument.
    // We call the constructors and create objects for each value in here not in main.
    EARTH(5.97),
    // Even if these constants don't have anyone use them,
    // the jvm create their objects in run time
    MARS(0.642),
    JUPITER(1898.0);

    // A field that stores the mass of each planet.
    // final means the value can be assigned only once.
    private final double mass;

    // Enum constructor: called automatically for each constant.
    // For example, EARTH(5.97) calls Planet(5.97).
    Planet(double mass) {
        // Store the received mass in this specific planet's field.
        this.mass = mass;
    }

    // Getter method to return the mass of the planet.
    double getMass() {
        return mass;
    }
}

public class EnumWithFields {
    public static void main(java.lang.String[] args) {
        // Access the EARTH constant and call its getter.
        // The output is 5.97 because this value was passed to its constructor.
        System.out.println(Planet.EARTH.getMass());
    }
}
