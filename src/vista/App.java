package vista;
import controlador.EmpresaTurismo;
import modelo.*;

import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        EmpresaTurismo empresaTurismo = new EmpresaTurismo(new ArrayList<>());
        String rutDeCliente;

        Hotel hotel = new Hotel(new DatosCliente("Nobara Cat", "20222554-8"), 50000, 15, "baja", true, 2, true);
        Hotel hotel2 = new Hotel(new DatosCliente("Gaston Cat", "20222320-8"), 40000, 14, "media", true, 2, false);
        Cabagna cabagna = new Cabagna(new DatosCliente("Francisca", "18326662-4"), 8000, 5, "baja", false, 6 );
        Carpa carpa = new Carpa(new DatosCliente("Vivi", "11133400-5"), 16000, 4, "alta", 4);

        empresaTurismo.ingresarAlojamientoHotel(hotel);
        empresaTurismo.ingresarAlojamientoHotel(hotel2);
        empresaTurismo.ingresarAlojamientoCabagna(cabagna);
        //empresaTurismo.ingresarAlojamientoCarpa(carpa);

        int opcion;
        do {
                opcion = menu();
                switch(opcion){
                    case 1:
                        rutDeCliente = pedirRut();
                        System.out.println("Ingrese nombre del cliente");
                        String nombre = Leer.dato();
                        System.out.println("Ingrese valor base por noche (Sin puntos, ejemplo: 20000");
                        int valorBasePorNoche = Leer.datoInt();
                        System.out.println("Ingrese cantidad de noches en numeros, ejemplo: 5");
                        int numDeNoches = Leer.datoInt();
                        String tipoDeTemporada;
                        do {
                            System.out.println("Ingrese el tipo de temporada (baja - media - alta)");
                            tipoDeTemporada = Leer.dato();
                        }while (tipoDeTemporada.compareToIgnoreCase("baja") !=0 && tipoDeTemporada.compareToIgnoreCase("media") !=0 && tipoDeTemporada.compareToIgnoreCase("alta") !=0);




                        break;
                    case 2:
                        if(empresaTurismo.getEmpresaTurismo().size()==0){
                            System.out.println("Aun no se han agregado alojamientos en nuestro sistema :( \n");
                        }else {
                            System.out.println(empresaTurismo.verAlojamientos());
                        }
                        break;
                    case 3:
                        if(empresaTurismo.getEmpresaTurismo().size()==0){
                            System.out.println("Cliente no encontrado. \n");
                        }else{
                            String rutSolicitado;
                            rutSolicitado = pedirRut();
                            empresaTurismo.mostrarCliente(rutSolicitado);
                        }
                        break;
                    case 4:
                        if(empresaTurismo.getEmpresaTurismo().size()==0){
                            System.out.println("No existe un alojamiento registrado con el rut ingresado :( \n");
                        }else {
                            String rutSolicitado;
                            rutSolicitado = pedirRut();
                            System.out.println("El total adicional para el rut ingresado es de: " + empresaTurismo.totalAdicional(rutSolicitado) + "\n");
                        }
                        break;
                    case 5:
                        if(empresaTurismo.getEmpresaTurismo().size()==0){
                            System.out.println("No existe un alojamiento registrado con el rut ingresado :( \n");
                        }else {
                            String rutSolicitado;
                            rutSolicitado = pedirRut();
                            System.out.println("El Bono total de descuento para el rut ingresado es de: " + empresaTurismo.totalBonoDescuento(rutSolicitado) + "\n");
                        }
                        break;
                    case 6:
                        if(empresaTurismo.getEmpresaTurismo().size()==0){
                            System.out.println("No existe un alojamiento registrado con el rut ingresado :( \n");
                        }else {
                            System.out.println("El número total de alojamientos ingresados en sistema es de : " + empresaTurismo.totalMediosAlojamiento() + "\n");
                        }
                        break;
                    case 7:
                        if(empresaTurismo.getEmpresaTurismo().size()==0){
                            System.out.println("No existe un alojamiento registrado con el rut ingresado :( \n");
                        }else {
                            String rutSolicitado;
                            rutSolicitado = pedirRut();
                            System.out.println("El rut ingresado tiene un valor a cancelar de : $" + empresaTurismo.valorAPagarCliente(rutSolicitado) + "\n");
                        }
                        break;
                    case 8:
                        if(empresaTurismo.getEmpresaTurismo().size()==0){
                            System.out.println("No existe un alojamiento registrado con el rut ingresado :( \n");
                        }else {
                            String rutSolicitado;
                            rutSolicitado = pedirRut();
                            System.out.println("El incremento valor base para el rut ingresado de acuerdo a la capacidad de la cabania es de : " + empresaTurismo.obtenerIncrementoValorBase(rutSolicitado) + "\n");
                        }
                        break;

                }
            } while (opcion != 9);

    }
    public static int menu(){
        System.out.println("Empresa de Turismo 'Valle grande' v1 ");
        System.out.println("1.\tIngresar Medio de Alojamiento");
        System.out.println("2.\tMostrar medios de alojamiento");
        System.out.println("3.\tDatos de un cliente");
        System.out.println("4.\tTotal adicional");
        System.out.println("5.\tTotal bono descuento");
        System.out.println("6.\tCantidad medios de alojamiento");
        System.out.println("7.\tValor a cancelar por un cliente");
        System.out.println("8.\tAplicar incremento del valor base");
        System.out.println("9.\tSalir");
        System.out.println("Por favor ingrese una opcion para continuar...");

        return Leer.datoInt();

    }
    public static String pedirRut(){
        System.out.println("Favor ingrese rut del cliente (Ej: 12345678-9)");
        return Leer.dato();
    }
}
