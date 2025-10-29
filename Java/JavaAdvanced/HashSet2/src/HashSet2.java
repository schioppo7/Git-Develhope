import java.util.HashSet;

public class HashSet2 {
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
        boolean elemento = strumenti.contains(NuovoElemento);
        System.out.println("L'elemento '" + NuovoElemento + "' è presente nel HashSet? " + elemento);
    }
}
