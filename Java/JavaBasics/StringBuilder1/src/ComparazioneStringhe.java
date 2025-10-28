public class ComparazioneStringhe {

    public static String stringheconfronto(String num1, String num2) {
        StringBuilder risultato;

        if (num1.equals(num2)) {
            risultato = new StringBuilder("Stringhe uguali");
        } else {
            risultato = new StringBuilder("Stringhe differenti");
        }

        return risultato.toString();
    }

    public static void main(String[] args) {
        String stringa1 = "Ciao Mi Chiamo Davide";
        String stringa2 = "Ciao Mi Chiamo Davide";
        String stringa3 = "Ciao mi Chiamo Simone";

        System.out.println(stringheconfronto(stringa1, stringa2));
        System.out.println(stringheconfronto(stringa1, stringa3));
    }
}
