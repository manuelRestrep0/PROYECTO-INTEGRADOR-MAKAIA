public class Empleado extends Usuario{
    private int antiguedad;
    private String rh;
    private String tipoEmpleado;

    public Empleado(int cedula, String nombre, String apellidos, String celular, String correoElectronico, String direccionResidencial, String ciudad, int antiguedad, String rh, String tipoEmpleado) {
        super(cedula, nombre, apellidos, celular, correoElectronico, direccionResidencial, ciudad);
        this.antiguedad = antiguedad;
        this.rh = rh;
        this.tipoEmpleado = tipoEmpleado;
    }
}
