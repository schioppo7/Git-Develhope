public class Checkchar {

    public static boolean checknum(char x) {
        if (x >= '0' && x <= '7') {
            return true;
        } else {
            throw new IllegalArgumentException("Il carattere non è un numero!");
        }
    }

    public static void main(String[] args) {
        System.out.println(checknum('7'));
        System.out.println(checknum('d'));
    }
}
