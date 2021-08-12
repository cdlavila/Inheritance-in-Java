class ValorTotal {
    // Atributos
    private double valorTotalGrabados;
    private double valorTotalGrabadosRelieve;
    private double valorTotalGrabadosPlano;
    private final Grabado[] grabados;

    // Constructores
    public ValorTotal(Grabado[] grabados){
        this.grabados=grabados;
        this.valorTotalGrabados = 0;
        this.valorTotalGrabadosRelieve = 0;
        this.valorTotalGrabadosPlano = 0;

    }

    // Metodos
    public void mostrarTotales() {
        for(int i=0; i<grabados.length; i++){
            if (grabados[i].getClass()== Relieve.class){
                valorTotalGrabadosRelieve += grabados[i].calcularPrecio();
            }
            else {
                if (grabados[i].getClass()== Plano.class){
                    valorTotalGrabadosPlano += grabados[i].calcularPrecio();
                }
                else {
                    valorTotalGrabados += grabados[i].calcularPrecio();
                }
            }

        }
        double totalColeccion=valorTotalGrabados+valorTotalGrabadosPlano+valorTotalGrabadosRelieve;

        // cálculos totales
        System.out.println(Math.round(valorTotalGrabados));
        System.out.println(Math.round(valorTotalGrabadosRelieve));
        System.out.println(Math.round(valorTotalGrabadosPlano));
        System.out.println(Math.round(totalColeccion));
    }
}
