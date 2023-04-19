package modelo;

public class DatosCliente {
    private String nombre;
    private String rut;

    public DatosCliente(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    public DatosCliente() {
    }

    //GETTERS Y SETTERS
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
