public class Divisione {
    public static void Divisione0(int numero) {
        try {
            int risultato = numero / 0;
            System.out.println("risultato= " + risultato);
        } catch (ArithmeticException x) {
            System.out.println("Errore trovato=" + x.getMessage());
        }
    }

    public static void main(String[] args) {
        Divisione0(10);
    }
}
