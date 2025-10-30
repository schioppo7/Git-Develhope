import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {

        ArrayList<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Davide", 20));
        studenti.add(new Student("Simone", 22));
        studenti.add(new Student("Gabriel", 19));
        studenti.add(new Student("Anna", 21));
        studenti.add(new Student("Matteo", 23));
        studenti.add(new Student("Sara", 20));
        studenti.add(new Student("Gabriele", 24));
        studenti.add(new Student("Francesca", 18));
        studenti.add(new Student("Paolo", 25));
        studenti.add(new Student("Chiara", 21));
        studenti.add(new Student("Simona", 22));
        studenti.add(new Student("Valentina", 19));
        System.out.println("Lista degli studenti:");
        for (Student x : studenti) {
            System.out.println(x.getNome() + " Età = " + x.getEtà());
        }

        Collections.sort(studenti, Comparator.comparingInt(Student::getEtà));

        System.out.println("Lista ordinata per Età = ");
        for (Student x : studenti) {
            System.out.println(x.getNome() + " Età = " + x.getEtà());
        }
    }
}
