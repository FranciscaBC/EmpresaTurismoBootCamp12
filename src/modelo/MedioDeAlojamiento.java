package modelo;

public abstract class MedioDeAlojamiento {
    private int valorBaseNoche;
    private int cantidadNoches;
    private String tipoTemporada;
    private DatosCliente datosCliente;

    public MedioDeAlojamiento(int valorBaseNoche, int cantidadNoches, String tipoTemporada, DatosCliente datosCliente) {
        this.valorBaseNoche = valorBaseNoche;
        this.cantidadNoches = cantidadNoches;
        this.tipoTemporada = tipoTemporada;
        this.datosCliente = datosCliente;
    }

    public MedioDeAlojamiento() {
    }

    //MÉTODOS
    public int subTotal(){
        return (this.cantidadNoches * this.valorBaseNoche);
    }

    public int bonoDescuento() {
        return this.tipoTemporada.equals("baja") ? this.subTotal() * 25/100 : (int) (this.tipoTemporada.equals("media") ? this.subTotal() * 12.5 / 100 : 0.0);
    }

    public abstract int valorACancelar();

    //GETTERS Y SETTERS
    public double getValorBaseNoche() {
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

    }
