import java.time.OffsetDateTime; import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle; import java.time.DayOfWeek; import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        OffsetDateTime ora = OffsetDateTime.now();
        boolean prima = data1.isBefore(data2);
        boolean seconda = data2.isAfter(data1);
        boolean ora1 = data1.isEqual(ora);
        boolean ora2 = data2.isEqual(ora);
        System.out.println("Prima data: " + data1);
        System.out.println("Seconda data: " + data2);
        System.out.println("Data ora: " + ora);
        System.out.println("La prima data è precedente alla seconda? " + prima);
        System.out.println("La seconda data è successiva alla prima? " + seconda);
        System.out.println("La prima data è uguale ad ora? " + ora1);
        System.out.println("La seconda data è uguale ad ora? " + ora2);
    }
}