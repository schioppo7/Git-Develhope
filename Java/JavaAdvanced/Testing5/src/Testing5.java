import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;




public class Testing5 {
    @Test
    public void testdata() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime newdata = data.plusYears(1)
                .minusMonths(1)
                .plusDays(7);
        assertEquals(2024, newdata.getYear());
        assertEquals(2, newdata.getMonthValue());
        assertEquals(8, newdata.getDayOfMonth());
    }

    @Test
    public void testdataItalia() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy", Locale.ITALIAN);
        String dataitaliana = data.format(formatter);

        assertTrue(dataitaliana.toLowerCase(Locale.ITALIAN).contains("mercoledì"));
        assertTrue(dataitaliana.contains("marzo"));
        assertTrue(dataitaliana.contains("2023"));
    }
}
