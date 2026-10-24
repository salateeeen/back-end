import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {

        // Get the current time from the system's default time zone.
        LocalTime time = LocalTime.now();

        // Print the current time.
        System.out.println(time);

        // Extract the hour, minute, second, and nanosecond.
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());

        // Create a specific time using hours and minutes.
        LocalTime customTime = LocalTime.of(14, 30);
        System.out.println(customTime);

        // Create a time with hours, minutes, and seconds.
        System.out.println(LocalTime.of(14, 30, 45));

        // Add hours and minutes to the current time.
        System.out.println(time.plusHours(2));
        System.out.println(time.plusMinutes(30));

        // Subtract hours and minutes from the current time.
        System.out.println(time.minusHours(1));
        System.out.println(time.minusMinutes(15));

        // Replace the hour and minute with specific values.
        System.out.println(time.withHour(10));
        System.out.println(time.withMinute(0));

        // Check whether the time is before another time.
        System.out.println(time.isBefore(LocalTime.of(18, 0)));

        // Check whether the time is after another time.
        System.out.println(time.isAfter(LocalTime.of(8, 0)));

        // Check whether two times are equal.
        System.out.println(time.equals(LocalTime.of(12, 0)));

        // Parse a time from a string in ISO-8601 format.
        LocalTime parsedTime = LocalTime.parse("15:45:30");
        System.out.println(parsedTime);

        // Get the number of seconds since midnight.
        System.out.println(time.toSecondOfDay());

        // Get the number of nanoseconds since midnight.
        System.out.println(time.toNanoOfDay());

        // Truncate the time to the nearest hour.
        System.out.println(time.truncatedTo(java.time.temporal.ChronoUnit.HOURS));
    }
}