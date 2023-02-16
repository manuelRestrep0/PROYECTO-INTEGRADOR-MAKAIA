public class Usuario {
    private int cedula;
    private String nombre;
    private String apellidos;
    private String celular;
    private String correoElectronico;
    private String direccionResidencial;
    private String ciudad;

    public Usuario(int cedula, String nombre, String apellidos, String celular, String correoElectronico, String direccionResidencial, String ciudad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.celular = celular;
        this.correoElectronico = correoElectronico;
        this.direccionResidencial = direccionResidencial;
        this.ciudad = ciudad;
    }
}
