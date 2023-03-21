package com.manuel.proyectointegrador.envio;

public class Paquete {
    private double id;
    private String tipoPaquete;
    private int peso;
    private double valorDeclarado;

    public Paquete() {
    }

    public Paquete(double id, String tipoPaquete, int peso, double valorDeclarado) {
        this.id = id;
        this.tipoPaquete = tipoPaquete;
        this.peso = peso;
        this.valorDeclarado = valorDeclarado;
    }
}
