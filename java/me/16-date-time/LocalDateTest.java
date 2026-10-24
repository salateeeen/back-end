import java.time.LocalDate;

public class LocalDateTest {
    public static void main(String[] args) {

        // Get the current date without time or timezone information.
        LocalDate date = LocalDate.now();

        // Print the date in ISO-8601 format (yyyy-MM-dd).
        System.out.println(date);

        // Extract the year from the date.
        System.out.println(date.getYear());

        // Extract the month as a Month enum (e.g., OCTOBER).
        System.out.println(date.getMonth());

        // Extract the month as a number (1-12).
        System.out.println(date.getMonthValue());

        // Extract the day of the month (1-31).
        System.out.println(date.getDayOfMonth());

        // Extract the day of the year (1-365 or 1-366).
        System.out.println(date.getDayOfYear());

        // Get the day of the week as a DayOfWeek enum.
        System.out.println(date.getDayOfWeek());

        // Check whether the year is a leap year.
        System.out.println(date.isLeapYear());

        // Create a new date by adding days.
        System.out.println(date.plusDays(7));

        // Create a new date by subtracting months.
        System.out.println(date.minusMonths(1));

        // Replace the year with a specific value.
        System.out.println(date.withYear(2025));

        // Check whether the date is before another date.
        System.out.println(date.isBefore(LocalDate.of(2027, 1, 1)));

        // Check whether the date is after another date.
        System.out.println(date.isAfter(LocalDate.of(2025, 1, 1)));

        // Create a specific date using year, month, and day.
        LocalDate customDate = LocalDate.of(2026, 10, 12);
        System.out.println(customDate);

        // Parse a date from an ISO-8601 string.
        LocalDate parsedDate = LocalDate.parse("2026-12-25");
        System.out.println(parsedDate);
    }
}