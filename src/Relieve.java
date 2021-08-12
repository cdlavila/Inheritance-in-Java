class Relieve extends Grabado {

    // Atributos
    public boolean linografia;

    // Constructores
    public Relieve(int antiguedad, boolean autenticado, double precioBase, boolean linografia) {
        super(antiguedad, autenticado, precioBase);
        this.linografia = linografia;
    }

    // Metodos
    @Override
    public double calcularPrecio() {
        double precioFinal = precioBase;

        if (autenticado){
            precioFinal += 800;
        }

        if (linografia){
            precioFinal += 700;
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
