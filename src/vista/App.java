package vista;

import controlador.EmpresaTurismo;
import modelo.*;

import java.util.Scanner;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        EmpresaTurismo empresaTurismo = new EmpresaTurismo(new ArrayList<>());
        String rutDeCliente;

        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    rutDeCliente = pedirRut();
                    if (empresaTurismo.buscarCte(rutDeCliente) == -1) {
                        System.out.println("Ingrese nombre del cliente");
                        String nombreDelCliente = Leer.dato();

                        Scanner scanner = new Scanner(System.in);
                        int valorBasePorNoche = 0;
                        while (valorBasePorNoche == 0) {
                            System.out.println("Ingrese valor base por noche (Sin puntos, ejemplo: 20000)");
                            if (scanner.hasNextInt()) {
                                valorBasePorNoche = scanner.nextInt();
                            } else {
                                System.out.println("Debe ingresar un valor numerico, por favor intente de nuevo");
                                scanner.next();
                            }
                        }


                        int numDeNoches = 0;
                        while (numDeNoches == 0) {
                            System.out.println("Ingrese cantidad de noches en numeros, ejemplo: 5");
                            if (scanner.hasNextInt()) {
                                numDeNoches = scanner.nextInt();
                            } else {
                                System.out.println("Debe ingresar un valor numerico, por favor intente de nuevo");
                                scanner.next();
                            }
                        }

                        String tipoDeTemporada;
                        do {
                            System.out.println("Ingrese el tipo de temporada (baja - media - alta)");
                            tipoDeTemporada = Leer.dato();
                        } while (tipoDeTemporada.compareToIgnoreCase("baja") != 0 && tipoDeTemporada.compareToIgnoreCase("media") != 0 && tipoDeTemporada.compareToIgnoreCase("alta") != 0);
                        int respuesta;
                        do {
                            System.out.println("Opciones: 1 = Carpa, 2 = Hotel, 3 = Cabania");
                            System.out.println("Ingrese numero de opcion para continuar... Ejemplo: 1");
                            respuesta = Leer.datoInt();
                        } while (respuesta < 1 || respuesta > 3);
                        if (respuesta == 1) {

                            int cantidadDePersonas = 0;
                            while (cantidadDePersonas == 0) {
                                System.out.println("Ingrese el numero de personas que utilizaran la carpa. Ejemplo: 5");
                                if (scanner.hasNextInt()) {
                                    cantidadDePersonas = scanner.nextInt();
                                } else {
                                    System.out.println("Debe ingresar un valor numerico, por favor intente de nuevo");
                                    scanner.next();
                                }
                            }

                            empresaTurismo.ingresarAlojamientoCarpa(new Carpa(new DatosCliente(nombreDelCliente, rutDeCliente), valorBasePorNoche, numDeNoches, tipoDeTemporada, cantidadDePersonas));
                            System.out.println("La carpa se ha reservado de forma exitosa \n");
                        } else {
                            String fuma;
                            boolean clienteFuma = false;
                            do {
                                System.out.println("¿Es fumador? Ejemplo: Si / No");
                                fuma = Leer.dato();
                                switch (fuma.toLowerCase()) {
                                    case "si":
                                        clienteFuma = true;
                                        break;
                                    case "no":
                                        clienteFuma = false;
                                        break;
                                    default: // caso de respuesta inválida
                                        System.out.println("Respuesta inválida. Por favor, ingrese 'si' o 'no'.");
                                        break;
                                }
                            } while (!fuma.equalsIgnoreCase("si") && !fuma.equalsIgnoreCase("no"));

                            int capacidadAlojamiento = 0;
                            while (capacidadAlojamiento == 0) {
                                System.out.println("Ingrese capacidad. Ejemplo: 5");
                                if (scanner.hasNextInt()) {
                                    capacidadAlojamiento = scanner.nextInt();
                                } else {
                                    System.out.println("Debe ingresar un valor numerico, por favor intente de nuevo");
                                    scanner.next();
                                }
                            }

                            if (respuesta == 2) {
                                String desayuno;
                                boolean incluyeDesayuno = false;
                                do {
                                    System.out.println("¿Desea el alojamiento con desayuno incluido? Ejemplo: Si / No");
                                    desayuno = Leer.dato();
                                    switch (desayuno.toLowerCase()) {
                                        case "si":
                                            incluyeDesayuno = true;
                                            break;
                                        case "no":
                                            incluyeDesayuno = false;
                                            break;
                                        default: // caso de respuesta inválida
                                            System.out.println("Respuesta inválida. Por favor, ingrese 'si' o 'no'.");
                                            break;
                                    }
                                } while (!desayuno.equalsIgnoreCase("si") && !desayuno.equalsIgnoreCase("no"));
                                empresaTurismo.ingresarAlojamientoHotel(new Hotel(new DatosCliente(nombreDelCliente, rutDeCliente), valorBasePorNoche, numDeNoches, tipoDeTemporada, clienteFuma, capacidadAlojamiento, incluyeDesayuno));
                                System.out.println("El hotel se ha reservado de forma exitosa \n");


                            } else {
                                String conChimenea;
                                boolean chimenea = false;
                                do {
                                    System.out.println("¿Desea que la cabania tenga  chimenea? Ejemplo: Si / No");
                                    conChimenea = Leer.dato();
                                    switch (conChimenea.toLowerCase()) {
                                        case "si":
                                            chimenea = true;
                                            break;
                                        case "no":
                                            chimenea = false;
                                            break;
                                        default: // caso de respuesta inválida
                                            System.out.println("Respuesta inválida. Por favor, ingrese 'si' o 'no'.");
                                            break;
                                    }
                                } while (!conChimenea.equalsIgnoreCase("si") && !conChimenea.equalsIgnoreCase("no"));
                                empresaTurismo.ingresarAlojamientoCabagna(new Cabagna(new DatosCliente(nombreDelCliente, rutDeCliente), valorBasePorNoche, numDeNoches, tipoDeTemporada, clienteFuma, capacidadAlojamiento, chimenea));
                                System.out.println("La cabania se ha reservado de forma exitosa \n");
                            }
                        }
                    } else {
                        System.out.println("El rut: " + rutDeCliente + " ya existe en nuestros registros");
                    }
                    break;
                case 2:
                    if (empresaTurismo.getEmpresaTurismo().size() == 0) {
                        System.out.println("Aun no se han agregado alojamientos en nuestro sistema :( \n");
                    } else {
                        System.out.println(empresaTurismo.verAlojamientos());
                    }
                    break;
                case 3:
                    if (empresaTurismo.getEmpresaTurismo().size() == 0) {
                        System.out.println("Aun no se han ingresado clientes, consulte mas tarde. \n");
                    } else {
                        String rutSolicitado;
                        rutSolicitado = pedirRut();
                        empresaTurismo.mostrarCliente(rutSolicitado);
                    }
                    break;
                case 4:
                    if (empresaTurismo.getEmpresaTurismo().size() == 0) {
                        System.out.println("Aun no se han ingresado clientes, consulte mas tarde. :( \n");
                    } else {
                        String rutSolicitado;
                        rutSolicitado = pedirRut();
                        System.out.println("Total adicional: " + empresaTurismo.totalAdicional(rutSolicitado) + "\n");
                    }
                    break;
                case 5:
                    if (empresaTurismo.getEmpresaTurismo().size() == 0) {
                        System.out.println("Aun no se han ingresado clientes, consulte mas tarde. :( \n");
                    } else {
                        String rutSolicitado;
                        rutSolicitado = pedirRut();
                        System.out.println("Total bono descuento: " + empresaTurismo.totalBonoDescuento(rutSolicitado) + "\n");
                    }
                    break;
                case 6:
                    if (empresaTurismo.getEmpresaTurismo().size() == 0) {
                        System.out.println("Aun no se han ingresado clientes, consulte mas tarde. :( \n");
                    } else {
                        System.out.println("El número total de alojamientos ingresados en sistema es de : " + empresaTurismo.totalMediosAlojamiento() + "\n");
                    }
                    break;
                case 7:
                    if (empresaTurismo.getEmpresaTurismo().size() == 0) {
                        System.out.println("Aun no se han ingresado clientes, consulte mas tarde. :( \n");
                    } else {
                        String rutSolicitado;
                        rutSolicitado = pedirRut();
                        System.out.println("El rut ingresado tiene un valor a cancelar de : " + empresaTurismo.valorAPagarCliente(rutSolicitado) + "\n");
                    }
                    break;
                case 8:
                    if (empresaTurismo.getEmpresaTurismo().size() == 0) {
                        System.out.println("Aun no se han ingresado clientes, consulte mas tarde. :( \n");
                    } else {
                        String rutSolicitado;
                        rutSolicitado = pedirRut();
                        System.out.println("El incremento valor base de acuerdo a la capacidad de la cabania es de : " + empresaTurismo.obtenerIncrementoValorBase(rutSolicitado) + "\n");
                    }
                    break;

            }
        } while (opcion != 9);

    }

    public static int menu() {
        System.out.println("****************************  Empresa de Turismo 'El mishi salvaje del desierto'  ****************************");
        System.out.println("*********************************  Para continuar, ingrese número de opción  *********************************");
        System.out.println("1.\tIngresar reserva de alojamiento");
        System.out.println("2.\tMostrar datos de medios de alojamiento ingresados");
        System.out.println("3.\tMostrar datos de un cliente");
        System.out.println("4.\tTotal adicional");
        System.out.println("5.\tTotal bono descuento");
        System.out.println("6.\tCantidad total medios de alojamiento");
        System.out.println("7.\tValor a cancelar por un cliente");
        System.out.println("8.\tAplicar incremento del valor base (Cabania)");
        System.out.println("9.\tSalir");
        System.out.println("Por favor ingrese una opcion para continuar...");

        return Leer.datoInt();

    }

    public static String pedirRut() {
        System.out.println("Favor ingrese rut del cliente (Ej: 12345678-9)");
        return Leer.dato();
    }
}
