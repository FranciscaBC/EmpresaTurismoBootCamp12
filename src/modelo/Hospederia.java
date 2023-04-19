package modelo;

public abstract class Hospederia extends MedioDeAlojamiento {
    private boolean esFumador;
    private int capacidad;

    public Hospederia(DatosCliente datosCliente, int valorBaseNoche, int cantidadNoches, String tipoTemporada, boolean esFumador, int capacidad) {
        super(datosCliente, valorBaseNoche, cantidadNoches, tipoTemporada);
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
