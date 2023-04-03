package modelo;

public class Hotel extends Hospederia {
    private boolean conDesayuno;

    public Hotel(double valorBaseNoche, int cantidadNoches, String tipoTemporada, DatosCliente datosCliente, boolean esFumador, int capacidad, boolean conDesayuno) {
        super(valorBaseNoche, cantidadNoches, tipoTemporada, datosCliente, esFumador, capacidad);
        this.conDesayuno = conDesayuno;
    }

    public Hotel() {
        super();
    }

    public boolean isConDesayuno() {
        return conDesayuno;
    }

    public void setConDesayuno(boolean conDesayuno) {
        this.conDesayuno = conDesayuno;
    }
}
