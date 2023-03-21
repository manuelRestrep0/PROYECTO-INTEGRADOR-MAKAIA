package com.manuel.proyectointegrador.usuario;

public class Empleado extends Usuario {
    private int Antiguedad;
    private String rh;
    private String tipoEmpleado;

    public Empleado() {
    }

    public Empleado(int cedula, String nombre, String apellido, String celular, String correoElectronico, String direccionResidencial, String ciudad, int antiguedad, String rh, String tipoEmpleado) {
        super(cedula, nombre, apellido, celular, correoElectronico, direccionResidencial, ciudad);
        Antiguedad = antiguedad;
        this.rh = rh;
        this.tipoEmpleado = tipoEmpleado;
    }

}
