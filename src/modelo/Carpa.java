package modelo;

public class Carpa extends MedioDeAlojamiento {
    private int cantidadPersonas;


    public Carpa(DatosCliente datosCliente, int valorBaseNoche, int cantidadNoches, String tipoTemporada,  int cantidadPersonas) {
        super(datosCliente, valorBaseNoche, cantidadNoches, tipoTemporada);
        this.cantidadPersonas = cantidadPersonas;
    }
    public Carpa(){
    }
    //GETTER Y SETTER
    public int getCantidadPersonas() {
        return cantidadPersonas;
    }
    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    @Override
    public int valorACancelar() {
        return this.subTotal() - this.bonoDescuento();
    }

}
