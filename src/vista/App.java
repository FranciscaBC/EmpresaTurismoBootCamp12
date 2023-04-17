package vista;
import controlador.EmpresaTurismo;
import modelo.*;

import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        EmpresaTurismo empresaTurismo = new EmpresaTurismo(new ArrayList<>());

        Hotel hotel = new Hotel(new DatosCliente("Nobara Cat", "20222554-8"), 50000, 15, "baja", true, 2, false);
        Cabagna cabagna = new Cabagna(new DatosCliente("Francisca", "18326662-4"), 8000, 5, "baja", false, 2 );
        Carpa carpa = new Carpa(new DatosCliente("Vivi", "11133400-5"), 16000, 4, "alta", 4);

        empresaTurismo.ingresarAlojamientoHotel(hotel);
        //empresaTurismo.ingresarAlojamientoCabagna(cabagna);
        //empresaTurismo.ingresarAlojamientoCarpa(carpa);

        int opcion;
        do {
                opcion = menu();
                switch(opcion){
                    case 1:
                        System.out.println("Ingreso medio de alojamiento");
                        break;
                    case 2:
                        if(empresaTurismo.getEmpresaTurismo().size()==0){
                            System.out.println("No hay alojamientos ingresados en nuestro sistema");
                        }else {
                            System.out.println(empresaTurismo.verAlojamientos());
                        }
                        break;
                    case 3:
                        System.out.println("Mostrar datos de cliente");
                        break;
                    case 4:
                        System.out.println("Total adicional");
                        break;
                    case 5:
                        System.out.println("Total bono descuento");
                        break;
                    case 6:
                        System.out.println("Cantidad medios de alojamiento");
                        break;
                    case 7:
                        System.out.println("Valor a cancelar");
                        break;
                    case 8:
                        System.out.println("Aplicar incremento del valor base");
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
