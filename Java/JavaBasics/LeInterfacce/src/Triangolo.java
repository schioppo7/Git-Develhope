class Triangolo implements Forma {
    private double base;
    private double altezza;
    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public void calcolaArea() {
        double area = (base * altezza) / 2;
        System.out.println("L'area del triangolo è: " + area);
    }
}
