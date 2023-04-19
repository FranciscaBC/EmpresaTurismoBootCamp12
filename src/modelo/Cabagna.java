package modelo;

public class Cabagna extends Hospederia {
    private boolean chimenea;

    public Cabagna(DatosCliente datosCliente, int valorBaseNoche, int cantidadNoches, String tipoTemporada, boolean esFumador, int capacidad, boolean chimenea) {
        super(datosCliente, valorBaseNoche, cantidadNoches, tipoTemporada, esFumador, capacidad);
        this.chimenea = chimenea;
    }

    public Cabagna() {

    }

    public boolean isChimenea() {
        return chimenea;
    }

    public void setChimenea(boolean chimenea) {
        this.chimenea = chimenea;
    }


    public int incrementaValorBase() {
        int incremento = this.getCapacidad() > 5 ? (int) (this.getValorBaseNoche() * 0.18) : 0;
        return incremento;
    }

    @Override
    public int valorACancelar() {
        return (this.subTotal() + incrementaValorBase()) - this.bonoDescuento();
    }


}
