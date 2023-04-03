package modelo;

public class MedioDeAlojamiento {
    private double valorBaseNoche;
    private int cantidadNoches;
    private String tipoTemporada;
    private DatosCliente datosCliente;

    public MedioDeAlojamiento(double valorBaseNoche, int cantidadNoches, String tipoTemporada, DatosCliente datosCliente) {
        this.valorBaseNoche = valorBaseNoche;
        this.cantidadNoches = cantidadNoches;
        this.tipoTemporada = tipoTemporada;
        this.datosCliente = datosCliente;
    }

    public MedioDeAlojamiento() {
    }

    public double getValorBaseNoche() {
        return valorBaseNoche;
    }

    public void setValorBaseNoche(double valorBaseNoche) {
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


    //•	subtotal: devolverá el subtotal a cancelar el cual será cantidad de noches por el valorBaseNoche
    public int subTotal(){
        return (int) (this.cantidadNoches * this.valorBaseNoche);
    }

    //•	bonoDescuento: devolverá el valor a descontar sabiendo que es un 25% del subTotal si el tipo de temporada
    // es baja o es de un 12.5% si el tipo Temporada es media.
    public int bonoDescuento() {
        double descuento; //se declara una variable de tipo double que almacenará el valor del porcentaje de descuento a aplicar
        if (this.tipoTemporada.equals("baja")) {
            descuento = 0.25;
        } else if (this.tipoTemporada.equals("media")) {
            descuento = 0.125;
        } else {
            descuento = 0.0;
        }
        return (int) (this.subTotal() * descuento);
        //devuelve el valor que se calcula multiplicando el subtotal por el porcentaje de descuento
    }

    //•	valorACancelar: devolverá el valor a cancelar, el cual al subtotal se le debe descontar el bono y sumar
    // el adicional, donde corresponda.

    public int valorACancelar(){
        //return (int) ((this.subTotal() - bonoDescuento()) + ESPERAR LA SIGUIENTE CLASE, ME PERDI AQUI JIJI)
        return 0;
    }









}
