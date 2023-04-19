package modelo;

public class Hotel extends Hospederia {
    private boolean conDesayuno;

    public Hotel(DatosCliente datosCliente, int valorBaseNoche, int cantidadNoches, String tipoTemporada, boolean esFumador, int capacidad, boolean conDesayuno) {
        super(datosCliente, valorBaseNoche, cantidadNoches, tipoTemporada, esFumador, capacidad);
        this.conDesayuno = conDesayuno;
    }

    public Hotel() {
    }

    public boolean isConDesayuno() {
        return conDesayuno;
    }

    public void setConDesayuno(boolean conDesayuno) {
        this.conDesayuno = conDesayuno;
    }

    public int adicional() {
        return (int) ((this.isEsFumador() && this.conDesayuno) ? 0.3 * this.subTotal() : 0);
    }

    @Override
    public int valorACancelar() {
        return this.subTotal() - this.bonoDescuento() + adicional();
    }


}
