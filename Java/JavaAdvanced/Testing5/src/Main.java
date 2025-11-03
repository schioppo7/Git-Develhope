import java.time.OffsetDateTime; import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle; import java.time.DayOfWeek; import java.util.Locale;


public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime newdata = data.plusYears(1)
                .minusMonths(1)
                .plusDays(7);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy")
                .withLocale(Locale.ITALY);
        System.out.println("Data prima: " + data.format(format));
        System.out.println("Data dopo: " + newdata.format(format));
    }
}
