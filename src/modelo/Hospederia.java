package modelo;

public class Hospederia extends MedioDeAlojamiento {
    private boolean esFumador;
    private int capacidad;

    public Hospederia(double valorBaseNoche, int cantidadNoches, String tipoTemporada, DatosCliente datosCliente, boolean esFumador, int capacidad) {
        super(valorBaseNoche, cantidadNoches, tipoTemporada, datosCliente);
        this.esFumador = esFumador;
        this.capacidad = capacidad;
    }

    public Hospederia() {
    }

    public boolean isEsFumador() {
        return esFumador;
    }

    public void setEsFumador(boolean esFumador) {
        this.esFumador = esFumador;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    //•	adicional: devolverá el valor adicional, que corresponde al 30% del subtotal si es Fumador y con desayuno.
    public int adicional(){
        //Hacer algo
        return 0;
    }

    //•	incrementaValorBase: aumenta el valor base en un 18% si la capacidad de la cabaña es superior a 5.
    public int incrementaValorBase(){

        return 0;
    }
}
