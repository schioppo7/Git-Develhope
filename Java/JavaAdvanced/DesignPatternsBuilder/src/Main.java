public class Main {
    public static void main(String[] args) {
        Person persona1 = new Builder("Davide", "Ulizi", 19, "Via Roma 7").build();
        Person persona2 = new Builder("Simone", "Farina", 21, "Via Como 7").build();

        System.out.println(persona1);
        System.out.println(persona2);
    }
}