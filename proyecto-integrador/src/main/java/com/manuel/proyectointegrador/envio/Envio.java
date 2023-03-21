package com.manuel.proyectointegrador.envio;

import java.util.Date;

public class Envio {
    private double numeroGuia;
    private int cedulaCliente;
    private String ciudadOrigen;
    private String ciudadDestino;
    private String direccionDestino;
    private String nombreRecibe;
    private String numeroRecibe;
    private Date horaEntrega;
    private String estadoEnvio;
    private double valorEnvio;
    private Paquete paquete;

    public Envio() {
    }

    public Envio(double numeroGuia, int cedulaCliente, String ciudadOrigen, String ciudadDestino, String direccionDestino, String nombreRecibe, String numeroRecibe, Date horaEntrega, String estadoEnvio, double valorEnvio) {
        this.numeroGuia = numeroGuia;
        this.cedulaCliente = cedulaCliente;
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
