public class AutoUnBoxing {
    public static void sommaInt(int a, int b) {
        System.out.println("Somma int: " + (a + b));
    }
    public static void stampaChar(char c) {
        System.out.println("Carattere char: " + c);
    }
    public static void sommaInteger(Integer a, Integer b) {
        System.out.println("Somma Integer: " + (a + b));
    }
    public static void stampaCharacter(Character c) {
        System.out.println("Carattere Character: " + c);
    }
}

public static void main (String[] args) {
    //valori primitivi
    int x = 7;
    double y = 3.5;
    char z = 'D';

    //valori Autoboxing
    Integer X = x;
    Double Y = y;
    Character zz = z;

    //valori unboxing
    int a = X;
    double b = Y;
    char c = zz;

}




