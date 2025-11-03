public class Main {
    public static void main(String[] args) {
        for (FactoryClass.EnumShape tipo : FactoryClass.EnumShape.values()) {
            ShapeClass forma = FactoryClass.getShape(tipo);
            forma.draw();
        }
    }
}


