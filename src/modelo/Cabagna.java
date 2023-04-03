package modelo;

public class Cabagna extends Hospederia {
    private boolean chimenea;

    public Cabagna(double valorBaseNoche, int cantidadNoches, String tipoTemporada, DatosCliente datosCliente, boolean esFumador, int capacidad, boolean chimenea) {
        super(valorBaseNoche, cantidadNoches, tipoTemporada, datosCliente, esFumador, capacidad);
        this.chimenea = chimenea;
    }

    public Cabagna() {
        super();
    }

    public boolean isChimenea() {
        return chimenea;
    }

    public void setChimenea(boolean chimenea) {
        this.chimenea = chimenea;
    }
}
