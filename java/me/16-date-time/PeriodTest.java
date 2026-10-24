import java.time.LocalDate;
import java.time.Period;

// Periode for Dates
public class PeriodTest {
    public static void main(String[] args) {

        // Create the start and end dates.
        LocalDate start = LocalDate.of(2026, 1, 1);
        LocalDate end = LocalDate.of(2026, 10, 1);

        // Calculate the period between two dates in years, months, and days.
        Period period = Period.between(start, end);

        // Get the years component of the period.
        System.out.println(period.getYears());

        // Get the months component of the period.
        System.out.println(period.getMonths());

        // Get the days component of the period.
        System.out.println(period.getDays());

        // Get the total number of months represented by the period.
        System.out.println(period.toTotalMonths());

        // Create a period of 2 years, 3 months, and 10 days.
        Period customPeriod = Period.of(2, 3, 10);
        System.out.println(customPeriod);

        // Create a period using only years.
        System.out.println(Period.ofYears(2));

        // Create a period using only months.
        System.out.println(Period.ofMonths(6));

        // Create a period using only days.
        System.out.println(Period.ofDays(15));

        // Add a period to a date.
        System.out.println(start.plus(period));

        // Subtract a period from a date.
        System.out.println(end.minus(Period.ofMonths(2)));

        // Check whether the period is zero or negative.
        System.out.println(period.isZero());
        System.out.println(period.isNegative());

        // Normalize months into years where possible.
        Period unnormalizedPeriod = Period.of(1, 14, 0);
        System.out.println(unnormalizedPeriod.normalized());

        // Calculate the period between two dates in reverse order.
        System.out.println(Period.between(end, start));
    }
}