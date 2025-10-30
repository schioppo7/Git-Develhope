import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> hmap1 = new HashMap<>();
        hmap1.put(1, "Mela"); hmap1.put(2, "Banana"); hmap1.put(3, "Ciliegia");
        System.out.println("HashMap 1 = " + hmap1);

        Map<Integer, String> hmap2 = new HashMap<>(Map.ofEntries(
                Map.entry(1, "Viti"), Map.entry(2, "Bulloni"), Map.entry(3, "Chiavi")
        ));
        System.out.println("HashMap 2 = " + hmap2);

        Map<Integer, String> hmap3 = new HashMap<>(Map.of(1, "Roma", 2, "Como", 3, "Bra"));
        System.out.println("HashMap 3 = " + hmap3);
    }
}