public class Main {
    public static void main(String[] args) {
        Forma areaforma = new Forma();
        areaforma.calcolaArea();

        Rettangolo rettangolo = new Rettangolo(7.7, 5.5);
        rettangolo.calcolaArea();

        Triangolo triangolo = new Triangolo (5.5, 7.7);
        triangolo.calcolaArea();
    }
}
