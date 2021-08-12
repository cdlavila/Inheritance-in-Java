class Plano extends Grabado {
    // Atributos
    private final String procedimiento;

    // Constructores
    public Plano(int antiguedad, boolean autenticado, double precioBase, String procedimiento){
        super(antiguedad, autenticado, precioBase);
        this.procedimiento=procedimiento;
    }

    // Metodos
    @Override
    public double calcularPrecio() {
        double precioFinal= this.precioBase;

        if (autenticado){
            precioFinal += 800;
        }

        if (procedimiento.equals("SERIGRAFIA")){
            precioFinal += 700;
        }
        if (procedimiento.equals("MONOPATIA")){
            precioFinal += 300;
        }
        if (procedimiento.equals("LITOGRAFIA")){
            precioFinal += 100;
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
