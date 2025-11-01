import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String full = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String medium = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String shortFmt = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        System.out.println("FULL: " + full);
        System.out.println("MEDIUM: " + medium);
        System.out.println("SHORT:  " + shortFmt);
    }
}