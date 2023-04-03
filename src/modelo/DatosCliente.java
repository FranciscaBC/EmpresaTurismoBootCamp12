package modelo;

public class DatosCliente {
    //atributos
    private String nombre;
    private String rut;

    public DatosCliente(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    public DatosCliente() {
    }

    //métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
}
