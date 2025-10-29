import java.util.HashSet;
import java.util.Iterator;

public class HashSet3 {
    public static HashSet<String> Hashlist() {
        HashSet<String> instruments = new HashSet<>();
        instruments.add("Bulloni");
        instruments.add("Viti");
        instruments.add("Brucola");
        instruments.add("Chiavi");
        return instruments;
    }


    public static void main(String[] args) {
        HashSet<String> strumenti = Hashlist();
        System.out.println("Elementi HashSet = " + strumenti);
        System.out.println("Grandezza HashSet = " + strumenti.size());
        String NuovoElemento = "Viti";
        if (strumenti.remove(NuovoElemento)) {
            System.out.println("Elemento '" + NuovoElemento + " 'rimosso");
        }

        System.out.println("Elementi dopo remove = " + strumenti);
        System.out.println("Grandezza Hashset dopo remove = " +strumenti.size());

        strumenti.clear();
        System.out.println("HashSet strumenti svuotato.");
        System.out.println("Hashset vuoto? " + strumenti.isEmpty());
    }
}
