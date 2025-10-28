class Rettangolo extends Forma {
    private double base;
    private double altezza;
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
        this.tipo = FormaArea.Rettangolo;
    }
    @Override
    public void calcolaArea() {
        double area = base * altezza;
        System.out.println("L'area del rettangolo è: " + area + " " + tipo);
    }
}
