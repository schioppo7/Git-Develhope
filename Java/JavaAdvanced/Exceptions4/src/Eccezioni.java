public class Eccezioni {
    public static void Divisone0indice(int[] array, int indice, int divisore) {
        try {
            int numero = array[indice];
            int risultato = numero / divisore;
            System.out.println("Risultato divsione:" + risultato);
        } catch (ArithmeticException x) {
            System.out.println("Errore trovato= " + x.getMessage());
        } catch (IndexOutOfBoundsException x) {
            System.out.println("Indice fuori dall'array" + x.getMessage());
        }
    }


    public static void main(String[] args) {
        int[] numeri = {10, 20, 30, 40, 50};
        Divisone0indice(numeri, 1, 0);
        Divisone0indice(numeri,7, 2);
        Divisone0indice(numeri, 3, 2);
    }
}

