import java.time.Duration;
import java.time.LocalTime;
import java.time.LocalDateTime;

// Duration for Times
public class DurationTest {
    public static void main(String[] args) {

        // Create the start and end times.
        LocalTime start = LocalTime.of(10, 0);
        LocalTime end = LocalTime.of(12, 30);

        // Calculate the duration between two temporal values.
        Duration duration = Duration.between(start, end);

        // Get the total duration in seconds.
        System.out.println(duration.getSeconds());

        // Get the total duration in minutes.
        System.out.println(duration.toMinutes());

        // Get the total duration in hours.
        System.out.println(duration.toHours());

        // Get the total duration in milliseconds.
        System.out.println(duration.toMillis());

        // Get the total duration in nanoseconds.
        System.out.println(duration.toNanos());

        // Create a duration of 90 minutes.
        Duration customDuration = Duration.ofMinutes(90);
        System.out.println(customDuration);

        // Add two durations together.
        System.out.println(duration.plusMinutes(30));

        // Subtract time from a duration.
        System.out.println(duration.minusMinutes(15));

        // Check whether the duration is zero, negative, or positive.
        System.out.println(duration.isZero());
        System.out.println(duration.isNegative());
        System.out.println(duration.isPositive());

        // Compare two durations.
        Duration anotherDuration = Duration.ofHours(3);
        System.out.println(duration.compareTo(anotherDuration));

        // Multiply a duration by a number.
        System.out.println(duration.multipliedBy(2));

        // Divide a duration by a number.
        System.out.println(duration.dividedBy(2));

        // Get the duration between two date-time values.
        LocalDateTime startDateTime =
                LocalDateTime.of(2026, 10, 12, 10, 0);

        LocalDateTime endDateTime =
                LocalDateTime.of(2026, 10, 13, 12, 0);

        Duration dateTimeDuration =
                Duration.between(startDateTime, endDateTime);

        System.out.println(dateTimeDuration.toHours());
    }
}