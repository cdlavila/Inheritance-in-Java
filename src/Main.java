public class Main {
    public static void main(String[] args) {
        Grabado[] grabados = new Grabado[5];
        grabados[0] = new Grabado(60, true, 1000.0);
        grabados[1] = new Relieve(65, true, 1000.0, true);
        grabados[2] = new Plano(66, true, 80.0, "SERIGRAFIA");
        grabados[3] = new Plano(90, true, 180.0, "MONOPATIA");
        grabados[4] = new Grabado();
        ValorTotal respuesta = new ValorTotal(grabados);
        respuesta.mostrarTotales();
    }
}
