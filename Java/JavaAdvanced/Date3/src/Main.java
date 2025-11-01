import java.time.OffsetDateTime; import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle; import java.time.DayOfWeek;
public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int anno = data.getYear();
        System.out.println("Anno: " + anno);
        int mese = data.getMonthValue();
        System.out.println("Mese: " + mese);
        int giorno = data.getDayOfMonth();
        System.out.println("Giorno: " + giorno);
        DayOfWeek giornoSettimana = data.getDayOfWeek();
        System.out.println("Giorno della settimana: " + giornoSettimana);
    }
}
