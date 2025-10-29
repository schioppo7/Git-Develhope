public class Divisione {
    public static double dividere(int numeratore, int denominatore) throws IllegalArgumentException {
        if (denominatore == 0) {
            throw new IllegalArgumentException("denominatore null");
        }
        return (double) numeratore / denominatore;
    }


    public static void main (String[] args) {
        try {
            System.out.println("Risultato1: " + dividere(10, 2));
        } catch (IllegalArgumentException x) {
            System.out.println("Errore: " + x.getMessage());
        }
        try {
            System.out.println("Risultato2: " + dividere(10, 0 ));
        } catch (IllegalArgumentException x) {
            System.out.println("Errore: " + x.getMessage());
        }
    }
}
