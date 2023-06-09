package modelo;

public abstract class MedioDeAlojamiento {
    private int valorBaseNoche;
    private int cantidadNoches;
    private String tipoTemporada;
    private DatosCliente datosCliente;

    public MedioDeAlojamiento(DatosCliente datosCliente, int valorBaseNoche, int cantidadNoches, String tipoTemporada) {
        this.datosCliente = datosCliente;
        this.valorBaseNoche = valorBaseNoche;
        this.cantidadNoches = cantidadNoches;
        this.tipoTemporada = tipoTemporada;
    }

    public MedioDeAlojamiento() {
    }

    public int getValorBaseNoche() {
        return valorBaseNoche;
    }

    public void setValorBaseNoche(int valorBaseNoche) {
        this.valorBaseNoche = valorBaseNoche;
    }

    public int getCantidadNoches() {
        return cantidadNoches;
    }

    public void setCantidadNoches(int cantidadNoches) {
        this.cantidadNoches = cantidadNoches;
    }

    public String getTipoTemporada() {
        return tipoTemporada;
    }

    public void setTipoTemporada(String tipoTemporada) {
        this.tipoTemporada = tipoTemporada;
    }

    public DatosCliente getDatosCliente() {
        return datosCliente;
    }

    public void setDatosCliente(DatosCliente datosCliente) {
        this.datosCliente = datosCliente;
    }

    public int subTotal() {
        return (this.getCantidadNoches() * this.getValorBaseNoche());
    }

    public int bonoDescuento() {
        return this.tipoTemporada.equals("baja") ? this.subTotal() * 25 / 100 : (int) (this.tipoTemporada.equals("media") ? this.subTotal() * 12.5 / 100 : 0.0);
    }

    public abstract int valorACancelar();


}
