public class Main {
    static class UnicodeExtractor {
        private String testo;
        private int indice;

        public UnicodeExtractor(String testo, int indice) {
            this.testo = testo;
            this.indice = indice;
        }

        public String unicodeCarattere() {
            StringBuilder risultato = new StringBuilder();
            if (indice >= 0 && indice < testo.length()) {
                risultato.append(testo.codePointAt(indice));
            } else {
                risultato.append("errore");
            }
            return risultato.toString();
        }
    }

    public static void main(String[] args) {
        UnicodeExtractor u1 = new UnicodeExtractor("Mi chiamo Davide", 10);
        System.out.println(u1.unicodeCarattere());

        UnicodeExtractor u2 = new UnicodeExtractor("Ciao", 7);
        System.out.println(u2.unicodeCarattere());
    }
}

