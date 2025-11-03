import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.OffsetDateTime;
import java.time.DayOfWeek;


public class Testing3 {

    @Test
    public void testdata() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals(DayOfWeek.WEDNESDAY, data.getDayOfWeek());
    }
}
