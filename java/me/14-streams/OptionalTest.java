import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {

        // Create an Optional containing a non-null value.
        // used to avoid null exception in run time
        Optional<String> name = Optional.of("Sultan");

        // Return the value if present; otherwise, return the default value.
        System.out.println(name.orElse("Unknown"));

        // Check whether a value is present.
        System.out.println(name.isPresent());

        // Check whether a value is absent.
        System.out.println(name.isEmpty());

        // Execute the action only if a value is present.
        name.ifPresent(value -> System.out.println("Name: " + value));

        // Transform the value if present.
        Optional<Integer> length = name.map(String::length);
        System.out.println(length.orElse(0));

        // Filter the value based on a condition.
        Optional<String> filteredName =
                name.filter(value -> value.startsWith("S"));
        System.out.println(filteredName.orElse("No match"));

        // Return the value if present; otherwise, throw an exception.
        System.out.println(name.orElseThrow());

        // Create an empty Optional with no value.
        Optional<String> emptyName = Optional.empty();

        // Return the default value because the Optional is empty.
        System.out.println(emptyName.orElse("Unknown"));

        // Provide a default value lazily if the Optional is empty.
        System.out.println(emptyName.orElseGet(() -> "Default Name"));

        // Execute the action only when the Optional is empty.
        emptyName.ifPresentOrElse(
                value -> System.out.println(value),
                () -> System.out.println("No name available")
        );

        // Create an Optional that allows a null value.
        Optional<String> nullableName = Optional.ofNullable(null);
        System.out.println(nullableName.isEmpty());

        // Transform the value into another Optional using flatMap.
        Optional<String> upperName =
                name.flatMap(value -> Optional.of(value.toUpperCase()));
        System.out.println(upperName.orElse("Unknown"));
    }
}