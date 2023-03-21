package com.manuel.proyectointegrador.usuario;

public class Usuario {
    private int cedula;
    private String nombre;
    private String apellido;
    private String celular;
    private String correoElectronico;
    private String direccionResidencial;
    private String ciudad;

    public Usuario() {
    }

    public Usuario(int cedula, String nombre, String apellido, String celular, String correoElectronico, String direccionResidencial, String ciudad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.correoElectronico = correoElectronico;
        this.direccionResidencial = direccionResidencial;
        this.ciudad = ciudad;
    }
}
