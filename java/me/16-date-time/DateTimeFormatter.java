public class DateTimeFormatter {
    public static void main(java.lang.String[] args) {
        java.time.LocalDate date =
                java.time.LocalDate.now();

        java.time.format.DateTimeFormatter formatter =
                java.time.format.DateTimeFormatter.ofPattern(
                        "dd-MM-yyyy"
                );

        System.out.println(date.format(formatter));
    }
}
