package modelo;

public class Cabagna extends Hospederia {
    private boolean chimenea;

    public Cabagna(DatosCliente datosCliente, int valorBaseNoche, int cantidadNoches, String tipoTemporada, boolean esFumador, int capacidad, boolean chimenea) {
        super(valorBaseNoche, cantidadNoches, tipoTemporada, datosCliente, esFumador, capacidad);
        this.chimenea = chimenea;
    }

    public Cabagna() {
        super();
    }

    // MÉTODOS
    public int incrementaValorBase(){
        int incremento = this.getCapacidad() > 5 ? (int) (this.getValorBaseNoche() * 0.18) : 0;
        this.setValorBaseNoche((int) (this.getValorBaseNoche() + incremento));
        return incremento;
    }

    @Override
    public int valorACancelar() {
        return this.subTotal() - this.bonoDescuento();
    }

    //GETTER Y SETTER
    public boolean isChimenea() {
        return chimenea;
    }

    public void setChimenea(boolean chimenea) {
        this.chimenea = chimenea;
    }




}
