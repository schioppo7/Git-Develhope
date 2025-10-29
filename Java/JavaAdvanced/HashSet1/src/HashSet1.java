import java.util.HashSet;

public class HashSet1 {
    public static HashSet<String> Hashlist() {
        HashSet<String> set = new HashSet<>();
        set.add("Bulloni");
        set.add("Viti");
        set.add("Brucola");
        set.add("Chiavi");
        return set;
    }


    public static void main(String[] args) {
        HashSet<String> strumenti = Hashlist();
        System.out.println("Elementi HashSet = " + strumenti);
        System.out.println("Grandezza HashSet = " + strumenti.size());
    }
}
