import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> hmap3 = new HashMap<>(Map.of(1, "Roma", 2, "Como", 3, "Bra"));
        System.out.println("HashMap 3 = " + hmap3);

        List<String> città = new ArrayList<>(hmap3.values());
        Collections.sort(città);
        System.out.println("Città in ordine alfabetico" + città);
    }
}
