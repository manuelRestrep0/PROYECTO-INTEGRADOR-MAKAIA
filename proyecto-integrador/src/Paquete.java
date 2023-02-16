public class Paquete {
    private double id;
    private String tipoPaquete;
    private int peso;
    private double valorDeclarado;

    public Paquete(String tipoPaquete, int peso, double valorDeclarado) {
        this.tipoPaquete = tipoPaquete;
        this.peso = peso;
        this.valorDeclarado = valorDeclarado;
    }
}
