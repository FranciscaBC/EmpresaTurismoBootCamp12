package modelo;

public class Carpa extends MedioDeAlojamiento {
    private int cantidadPersonas;

    public Carpa(DatosCliente datosCliente, int cantidadNoches, double valorBaseNoche, String tipoTemporada, int cantidadPersonas) {
        super(valorBaseNoche, cantidadNoches, tipoTemporada, datosCliente);
        this.cantidadPersonas = cantidadPersonas;
    }

    public Carpa(){

    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }
}
