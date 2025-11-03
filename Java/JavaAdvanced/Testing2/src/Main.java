import org.junit.jupiter.api.Test; import static org.junit.jupiter.api.Assertions.*;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String full = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("FULL: " + full);
        String medium = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("MEDIUM: " + medium);
        String shortFmt = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("SHORT:  " + shortFmt);
    }
}
