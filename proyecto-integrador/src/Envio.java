public class Envio {
    private String numeroGuia;
    private Cliente cliente;
    private String ciudadOrigen;
    private String ciudadDestino;
    private String direccionDestino;
    private String nombreRecibe;
    private String numeroRecibe;
    private String horaEntrega;
    private String estadoEnvio;
    private double valorEnvio;

    public Envio(String numeroGuia, Cliente cliente, String ciudadOrigen, String ciudadDestino, String direccionDestino, String nombreRecibe, String numeroRecibe, String horaEntrega, String estadoEnvio, double valorEnvio) {
        this.numeroGuia = numeroGuia;
        this.cliente = cliente;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.direccionDestino = direccionDestino;
        this.nombreRecibe = nombreRecibe;
        this.numeroRecibe = numeroRecibe;
        this.horaEntrega = horaEntrega;
        this.estadoEnvio = estadoEnvio;
        this.valorEnvio = valorEnvio;
    }
}
