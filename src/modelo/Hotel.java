package modelo;

public class Hotel extends Hospederia {
    private boolean conDesayuno;

    public Hotel(DatosCliente datosCliente, int valorBaseNoche, int cantidadNoches, String tipoTemporada, boolean esFumador, int capacidad, boolean conDesayuno) {
        super(valorBaseNoche, cantidadNoches, tipoTemporada, datosCliente, esFumador, capacidad);
        this.conDesayuno = conDesayuno;
    }

    public Hotel() {
        super();
    }

    //MÉTODOS
    public int adicional() {
        return (int) ((this.isEsFumador() && this.conDesayuno) ? 0.3 * this.subTotal() : 0);
    }

    @Override
    public int valorACancelar() {
        return this.subTotal() - this.bonoDescuento() + adicional();
    }

    //GETTERSY SETTER
    public boolean isConDesayuno() {
        return conDesayuno;
    }

    public void setConDesayuno(boolean conDesayuno) {
        this.conDesayuno = conDesayuno;
    }






}
