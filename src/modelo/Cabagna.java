package modelo;

public class Cabagna extends Hospederia {
    private boolean chimenea;

    public Cabagna(DatosCliente datosCliente, int valorBaseNoche, int cantidadNoches, String tipoTemporada, boolean esFumador, int capacidad) {
        super(datosCliente, valorBaseNoche, cantidadNoches, tipoTemporada, esFumador, capacidad);
    }

    public Cabagna(){

    }

    //GETTER Y SETTER
    public boolean isChimenea() {
        return chimenea;
    }
    public void setChimenea(boolean chimenea) {
        this.chimenea = chimenea;
    }

    // MÉTODOS
    public int incrementaValorBase(){
        int incremento = this.getCapacidad() > 5 ? (int) (this.getValorBaseNoche() * 0.18) : 0;
        return incremento;
    }
    @Override
    public int valorACancelar() {
        return (this.subTotal() + incrementaValorBase()) - this.bonoDescuento();
    }






}
