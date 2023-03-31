package com.manuel.proyectointegrador.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "envios")
public class Envio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private double numeroGuia;
    @OneToOne
    @JoinColumn(name = "cedula")
    private Cliente cliente;
    @Column(name = "origen")
    private String ciudadOrigen;
    @Column(name = "destino")
    private String ciudadDestino;
    @Column(name = "direccion")
    private String direccionDestino;
    @Column(name = "receptor")
    private String nombreRecibe;
    @Column(name = "celular")
    private String numeroRecibe;
    @Column(name = "hora")
    private Date horaEntrega;
    @Column(name = "estado")
    private String estadoEnvio;
    @Column(name = "valor")
    private Double valorEnvio;
    @OneToOne
    @JoinColumn(name = "idPaquete")
    private Paquete paquete;

    public Envio() {
    }

    public Envio(double numeroGuia, Cliente cliente, String ciudadOrigen, String ciudadDestino, String direccionDestino, String nombreRecibe, String numeroRecibe, Date horaEntrega, String estadoEnvio, Double valorEnvio, Paquete paquete) {
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
        this.paquete = paquete;
    }

    public double getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(double numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public String getNombreRecibe() {
        return nombreRecibe;
    }

    public void setNombreRecibe(String nombreRecibe) {
        this.nombreRecibe = nombreRecibe;
    }

    public String getNumeroRecibe() {
        return numeroRecibe;
    }

    public void setNumeroRecibe(String numeroRecibe) {
        this.numeroRecibe = numeroRecibe;
    }

    public Date getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(Date horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    public Double getValorEnvio() {
        return valorEnvio;
    }

    public void setValorEnvio(Double valorEnvio) {
        this.valorEnvio = valorEnvio;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }
}
