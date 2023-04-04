package modelo;

public abstract class Hospederia extends MedioDeAlojamiento {
    private boolean esFumador;
    private int capacidad;

    public Hospederia(int valorBaseNoche, int cantidadNoches, String tipoTemporada, DatosCliente datosCliente, boolean esFumador, int capacidad) {
        super(valorBaseNoche, cantidadNoches, tipoTemporada, datosCliente);
        this.esFumador = esFumador;
        this.capacidad = capacidad;
    }

    public Hospederia() {
    }

    public boolean isEsFumador() {
        return esFumador;
    }

    public void setEsFumador(boolean esFumador) {
        this.esFumador = esFumador;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

}
