class Forma {
    protected FormaArea tipo;
    public void calcolaArea() {
        System.out.println("Area forma: " + tipo);
    }
}

enum FormaArea {
    Rettangolo,
    Triangolo
}
