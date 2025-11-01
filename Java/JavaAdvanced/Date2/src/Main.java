import java.time.OffsetDateTime; import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String newdata = data.format(format);
        System.out.println(newdata);
    }
}