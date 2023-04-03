package vista;

import modelo.DatosCliente;

public class App {

    public static void main(String []args){
        //instanciar un objeto de tipo datos de un cliente
        //Constructor
        DatosCliente datosCliente = new DatosCliente();
        datosCliente.nombre = "Francisca";
        datosCliente.rut = "18326662-4";

        System.out.println("Nombre del cliente: "+datosCliente.nombre);
        System.out.println("Rut del cliente: "+datosCliente.rut);

    }

}
