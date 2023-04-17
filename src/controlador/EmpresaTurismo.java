package controlador;

import modelo.*;
import java.util.ArrayList;

public class EmpresaTurismo {
    private ArrayList<MedioDeAlojamiento> empresaTurismo;
    
    public EmpresaTurismo(ArrayList<MedioDeAlojamiento> empresaTurismo) {
        this.empresaTurismo = empresaTurismo;
    }
    public EmpresaTurismo(){}

    public ArrayList<MedioDeAlojamiento> getEmpresaTurismo() {
        return empresaTurismo;
    }
    public void setEmpresaTurismo(ArrayList<MedioDeAlojamiento> empresaTurismo) {
        this.empresaTurismo = empresaTurismo;
    }

    public int buscarCte(String rut){
        for(int i=0; i < empresaTurismo.size();i++){
            if(empresaTurismo.get(i).getDatosCliente().getRut().compareToIgnoreCase(rut)==0 ){
                return i;}}
        return -1;} //No se encontro cte

    //Ingresar Cabaña
    public void ingresarAlojamientoCabagna(Cabagna cabagna){
        if(buscarCte(cabagna.getDatosCliente().getRut())==-1){
            empresaTurismo.add(cabagna);}}

    //Ingresar Hotel
    public void ingresarAlojamientoHotel(Hotel hotel){
        if(buscarCte(hotel.getDatosCliente().getRut())==-1){
            empresaTurismo.add(hotel);}}

    //Ingresar Carpa
    public void ingresarAlojamientoCarpa(Carpa carpa){
        if(buscarCte(carpa.getDatosCliente().getRut())==-1){
            empresaTurismo.add(carpa);}}


    public String verAlojamientos() {
        String msj = ""; Carpa carpa = null; Cabagna cabagna = null; Hotel hotel = null;
        int contador = 0;
        for (int i = 0; i < empresaTurismo.size(); i++) {
            if (empresaTurismo.get(i) instanceof Hotel) {
                hotel = (Hotel) empresaTurismo.get(i);
                msj = "\n Nombre cliente: "+ hotel.getDatosCliente().getNombre() + "\n El rut del cliente es: "+ hotel.getDatosCliente().getRut() + "\n Temporada: " + hotel.getTipoTemporada() +  "\n Cantidad de noches: " + hotel.getCantidadNoches() + "\n Valor base noche: " + hotel.getValorBaseNoche() + "\n Capacidad: " + hotel.getCapacidad() + "\n Es fumador: " + hotel.isEsFumador() + "\n Con desayuno: " + hotel.isConDesayuno();
                 contador++;
            } else if (empresaTurismo.get(i) instanceof Cabagna) {
                cabagna = (Cabagna) empresaTurismo.get(i);
                msj = "\n Nombre cliente: "+ cabagna.getDatosCliente().getNombre() + "\n El rut del cliente es: "+ cabagna.getDatosCliente().getRut() + "\n Temporada: " + cabagna.getTipoTemporada() + "\n Cantidad de noches: " + cabagna.getCantidadNoches() + "\n Valor base noche: " + cabagna.getValorBaseNoche() + "\n Capacidad: " + cabagna.getCapacidad() + "\n Con chimenea: " + cabagna.isChimenea();
                contador++;
            } else if (empresaTurismo.get(i) instanceof Carpa) {
                carpa = (Carpa) empresaTurismo.get(i);
                msj = "\n Nombre cliente: "+ carpa.getDatosCliente().getNombre() + "\n El rut del cliente es: "+ carpa.getDatosCliente().getRut() + "\n Temporada: " + carpa.getTipoTemporada() + "\n Cantidad de noches: " + carpa.getCantidadNoches() + "\n Valor base noche: " + carpa.getValorBaseNoche() + "\n Cantidad de personas: " + carpa.getCantidadPersonas();
                contador++;
            }
        }
        if (contador == 0)
            System.out.println("No se encontraron alojamientos para el rut ingresado");
        return msj;

    }


    public void mostrarCliente(String rut) {
        MedioDeAlojamiento alojamientoEncontrado = null;
        for (int i = 0; i < empresaTurismo.size(); i++) {
            MedioDeAlojamiento alojamiento = empresaTurismo.get(i); {
            if (alojamiento.getDatosCliente().getRut().compareToIgnoreCase(rut) == 0) {
                alojamientoEncontrado = alojamiento;
                break;
            }
        }
        if (alojamientoEncontrado != null) {
            System.out.println("Datos del cliente:");
            System.out.println("Nombre: " + alojamientoEncontrado.getDatosCliente().getNombre());
            System.out.println("Rut: " + alojamientoEncontrado.getDatosCliente().getRut());
            System.out.println("Alojado en: " + alojamientoEncontrado.getClass().getSimpleName()); // se usa el metodo getClass() para obtener la clase del objeto y el metodo getSimpleName() para obtener el nombre simple de la clase.
            System.out.println("Temporada: " + alojamientoEncontrado.getTipoTemporada());
            System.out.println("Descuento de acuerdo a temporada: " + alojamientoEncontrado.bonoDescuento());
            System.out.println("Cantidad de noches: " + alojamientoEncontrado.getCantidadNoches());
            System.out.println("Valor base por noche: " + alojamientoEncontrado.getValorBaseNoche());;
            System.out.println("Total a pagar: $" + alojamientoEncontrado.valorACancelar());
            if (alojamientoEncontrado instanceof Carpa) {
                System.out.println("Cantidad de personas: " + ((Carpa) alojamientoEncontrado).getCantidadPersonas());
            } else if (alojamientoEncontrado instanceof Hotel) {
                System.out.println("Capacidad: " + ((Hotel) alojamientoEncontrado).getCapacidad());
                System.out.println("Con desayuno: " + ((Hotel) alojamientoEncontrado).isConDesayuno());
                System.out.println("Es fumador: " + ((Hotel) alojamientoEncontrado).isEsFumador());
            } else if (alojamientoEncontrado instanceof Cabagna) {
                System.out.println("Capacidad: " + ((Cabagna) alojamientoEncontrado).getCapacidad());
                System.out.println("Con chimenea: " + ((Cabagna) alojamientoEncontrado).isChimenea());
                System.out.println("Es fumador: " + ((Cabagna) alojamientoEncontrado).isEsFumador());
            }
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }


    //Seguir aqui


}
}