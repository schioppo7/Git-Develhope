public class Errori {

    public static boolean rangecheck(int numero, int minimo, int massimo) {
        if (numero >= minimo && numero <= massimo)
            return true;
        else
            throw new ArithmeticException("Numero non compreso nel range!");
    }

    public static void main(String[] args) {
        System.out.println(rangecheck(7, 0, 8));
        System.out.println(rangecheck(14, 0, 10));
    }
}
