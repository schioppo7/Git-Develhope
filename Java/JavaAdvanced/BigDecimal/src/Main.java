import java.math.BigDecimal;

public class Main {
    enum Operazioni {Addizione, Sottrazione, Moltiplicazione, Divisione, Minimo, Massimo}

    public static void main(String[] args) {
        BigDecimal x = new BigDecimal("7.7");
        BigDecimal y = new BigDecimal("14.14");
        Operazioni z = Operazioni.Addizione;
        BigDecimal risultato = calcola(x, y, z);
        System.out.println("Operazione utilizzata = " + z);
        System.out.println("Numero 1 = " + x);
        System.out.println("Numero 2 = " + y);
        System.out.println("Risultato Operazione = " + risultato);
    }


    static BigDecimal calcola(BigDecimal x, BigDecimal y, Operazioni z) {
        switch (z) {
            case Moltiplicazione -> {
                return x.multiply(y);
            }
            case Addizione -> {
                return x.add(y);
            }
            default -> {
                return BigDecimal.ZERO;

            }
        }
    }
}

