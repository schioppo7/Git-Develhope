class FactoryClass {

    public enum EnumShape {
        CERCHIO,
        TRIANGOLO
    }

    public static ShapeClass getShape(EnumShape tipo) {
        switch (tipo) {
            case CERCHIO:
                return new Circle();
            case TRIANGOLO:
                return new Triangolo();
        }
        return null;
    }
}
