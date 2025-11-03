import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Testing1 {

    @Test
    public void testRangecheck() {
        assertTrue(Errori.rangecheck(7, 0, 8), "il numero 7 è nel range");
    }
}
