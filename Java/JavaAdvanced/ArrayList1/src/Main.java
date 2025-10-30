import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studenti = new ArrayList<>();

        studenti.add(new Student("Davide", 19));
        studenti.add(new Student("Gabriel", 19));
        studenti.add(new Student("Simone", 21));
        System.out.println("Lista degli studenti =");
        for (Student x : studenti) {
            System.out.println(x.getNome() + " Età = " + x.getEtà());
        }

        studenti.add(new Student("Giulia", 16));
        studenti.add(new Student("Stefania", 22));
        studenti.add(new Student("Vittoria", 17));
        studenti.add(new Student("Gabriela", 18));
        System.out.println("Lista degli studenti nuovi =");
        for (Student x : studenti) {
            System.out.println(x.getNome() + " Età = " + x.getEtà());
        }
    }
}


