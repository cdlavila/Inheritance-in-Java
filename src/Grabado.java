class Grabado {
    // Constantes
    private final static double PRECIOBASE = 350.0;
    private final static int ANTIGUEDAD = 50;
    private final static boolean AUTENTICADO = false;

    // Atributos
    protected int antiguedad;
    protected boolean autenticado;
    protected double precioBase;

    // Constructores
    // Constructor por defecto
    public Grabado(){
        this.antiguedad = ANTIGUEDAD;
        this.autenticado = AUTENTICADO;
        this.precioBase = PRECIOBASE;
    }

    public Grabado(int antiguedad, boolean autenticado, double precioBase){
        this.antiguedad = antiguedad;
        this.autenticado = autenticado;
        this.precioBase = precioBase;
    }

    // Métodos
    public double calcularPrecio() {
        double precioFinal = precioBase;

        if (autenticado){
            precioFinal += 800;
        }

        if (antiguedad>=50 && antiguedad<=70){
            precioFinal += precioBase*0.1;
            return precioFinal;
        }
        if (antiguedad>70 && antiguedad<=120){
            precioFinal += precioBase*0.25;
            return precioFinal;
        }
        if (antiguedad>120){
            precioFinal += precioBase*0.4;
            return precioFinal;
        }

        return precioFinal;

    }
}

