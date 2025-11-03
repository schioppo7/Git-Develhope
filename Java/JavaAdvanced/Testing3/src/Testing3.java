import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Testing3 {
    @Test
    public void testdata() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN);
        String newdata = data.format(format);
        assertEquals("01 marzo 2023", newdata);
    }
}
