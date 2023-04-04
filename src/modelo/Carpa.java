package modelo;

public class Carpa extends MedioDeAlojamiento {
    private int cantidadPersonas;

    public Carpa(DatosCliente datosCliente, int cantidadNoches, int valorBaseNoche, String tipoTemporada, int cantidadPersonas) {
        super(valorBaseNoche, cantidadNoches, tipoTemporada, datosCliente);
        this.cantidadPersonas = cantidadPersonas;
    }

    public Carpa(){
    }

    // MÉTODO
    @Override
    public int valorACancelar() {
        return this.subTotal() - this.bonoDescuento();
    }

    //GETTER Y SETTER
    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }
}
