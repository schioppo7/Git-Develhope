import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> frutti = new LinkedList<>();

        frutti.add(new Fruit("Fragole"));
        frutti.add(new Fruit("Mele"));
        frutti.add(new Fruit("Banane"));
        frutti.add(new Fruit("Cocco"));
        System.out.println("Lista ortofrutticolo = ");
        for (Fruit x : frutti) {
            System.out.println(x.getName());
        }

        frutti.addFirst(new Fruit("Pere"));
        frutti.addLast(new Fruit("Avocado"));
        System.out.println("Lista ortofrutticolo aggiornata = ");
        for (Fruit x : frutti) {
            System.out.println(x.getName());
        }
    }
}
