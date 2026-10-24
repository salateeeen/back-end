import java.time.LocalDateTime;

public class LocalDateTimeTest {
    public static void main(String[] args) {

        // Get the current date and time without timezone information.
        LocalDateTime dateTime = LocalDateTime.now();

        // Print the date and time in ISO-8601 format.
        System.out.println(dateTime);

        // Extract the year, month, and day.
        System.out.println(dateTime.getYear());
        System.out.println(dateTime.getMonth());
        System.out.println(dateTime.getDayOfMonth());

        // Extract the hour, minute, second, and nanosecond.
        System.out.println(dateTime.getHour());
        System.out.println(dateTime.getMinute());
        System.out.println(dateTime.getSecond());
        System.out.println(dateTime.getNano());

        // Add days and hours to the current date and time.
        System.out.println(dateTime.plusDays(7));
        System.out.println(dateTime.plusHours(2));

        // Subtract minutes and months from the current date and time.
        System.out.println(dateTime.minusMinutes(30));
        System.out.println(dateTime.minusMonths(1));

        // Replace the year and hour with specific values.
        System.out.println(dateTime.withYear(2027));
        System.out.println(dateTime.withHour(10));

        // Check whether the date and time are before another value.
        LocalDateTime future = LocalDateTime.of(2027, 1, 1, 12, 0);
        System.out.println(dateTime.isBefore(future));

        // Check whether the date and time are after another value.
        System.out.println(dateTime.isAfter(future));

        // Create a specific date and time.
        LocalDateTime customDateTime =
                LocalDateTime.of(2026, 12, 25, 18, 30);
        System.out.println(customDateTime);

        // Parse a date and time from an ISO-8601 string.
        LocalDateTime parsedDateTime =
                LocalDateTime.parse("2026-12-25T18:30:00");
        System.out.println(parsedDateTime);

        // Compare two date-time values.
        System.out.println(dateTime.equals(customDateTime));
    }
}