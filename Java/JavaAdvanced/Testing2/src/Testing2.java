import org.junit.jupiter.api.Test; import static org.junit.jupiter.api.Assertions.*;

import java.text.Normalizer;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Testing2 {

    @Test
    void testDate() {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        DateTimeFormatter full = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        assertEquals("venerdì 1 marzo 2002",data.format(full));
        DateTimeFormatter medium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        assertEquals("1 mar 2002", data.format(medium));
        DateTimeFormatter shortFmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        assertEquals("01/03/02", data.format(shortFmt));
    }
}
