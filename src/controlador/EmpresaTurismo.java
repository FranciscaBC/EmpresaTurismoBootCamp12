package controlador;

import modelo.*;

import java.util.ArrayList;


public class EmpresaTurismo {
    private ArrayList<MedioDeAlojamiento> empresaTurismo;
    public EmpresaTurismo(ArrayList<MedioDeAlojamiento> empresaTurismo) {
        this.empresaTurismo = empresaTurismo;
    }

    public ArrayList<MedioDeAlojamiento> getEmpresaTurismo() {
        return empresaTurismo;
    }

    public void setEmpresaTurismo(ArrayList<MedioDeAlojamiento> empresaTurismo) {
        this.empresaTurismo = empresaTurismo;
    }

    public int buscarCte(String rut) {
        for (int i = 0; i < empresaTurismo.size(); i++) {
            if (empresaTurismo.get(i).getDatosCliente().getRut().compareToIgnoreCase(rut) == 0) {
                return i;
            }
        }
        return -1;
    }

    public void ingresarAlojamientoCabagna(Cabagna cabagna) {
        if (buscarCte(cabagna.getDatosCliente().getRut()) == -1) {
            empresaTurismo.add(cabagna);
        }
    }

    public void ingresarAlojamientoHotel(Hotel hotel) {
        if (buscarCte(hotel.getDatosCliente().getRut()) == -1) {
            empresaTurismo.add(hotel);
        }
    }

    public void ingresarAlojamientoCarpa(Carpa carpa) {
        if (buscarCte(carpa.getDatosCliente().getRut()) == -1) {
            empresaTurismo.add(carpa);
        }
    }


    public String verAlojamientos() {
        StringBuilder msj = new StringBuilder();
        int contador = 0;

        for (MedioDeAlojamiento alojamiento : empresaTurismo) {
            if (alojamiento instanceof Hotel hotel) {
                msj.append("\nTipo de alojamiento: Hotel" + "\n Nombre cliente: ").append(hotel.getDatosCliente().getNombre()).append("\n El rut del cliente es: ").append(hotel.getDatosCliente().getRut()).append("\n Temporada: ").append(hotel.getTipoTemporada()).append("\n Cantidad de noches: ").append(hotel.getCantidadNoches()).append("\n Valor base noche: ").append(hotel.getValorBaseNoche()).append("\n Capacidad: ").append(hotel.getCapacidad()).append("\n Es fumador: ").append(hotel.isEsFumador()).append("\n Con desayuno: ").append(hotel.isConDesayuno()).append("\n\n");
                contador++;
            } else if (alojamiento instanceof Cabagna cabagna) {
                msj.append("\nTipo de alojamiento: Cabania" + "\n Nombre cliente: ").append(cabagna.getDatosCliente().getNombre()).append("\n El rut del cliente es: ").append(cabagna.getDatosCliente().getRut()).append("\n Temporada: ").append(cabagna.getTipoTemporada()).append("\n Cantidad de noches: ").append(cabagna.getCantidadNoches()).append("\n Valor base noche: ").append(cabagna.getValorBaseNoche()).append("\n Capacidad: ").append(cabagna.getCapacidad()).append("\n Con chimenea: ").append(cabagna.isChimenea()).append("\n\n");
                contador++;
            } else if (alojamiento instanceof Carpa carpa) {
                msj.append("\nTipo de alojamiento: Carpa" + "\n Nombre cliente: ").append(carpa.getDatosCliente().getNombre()).append("\n El rut del cliente es: ").append(carpa.getDatosCliente().getRut()).append("\n Temporada: ").append(carpa.getTipoTemporada()).append("\n Cantidad de noches: ").append(carpa.getCantidadNoches()).append("\n Valor base noche: ").append(carpa.getValorBaseNoche()).append("\n Cantidad de personas: ").append(carpa.getCantidadPersonas()).append("\n\n");
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No existen registros de alojamientos :(");
        }
        return msj.toString();
    }


    public void mostrarCliente(String rut) {
        MedioDeAlojamiento alojamientoEncontrado = null;
        for (MedioDeAlojamiento alojamiento : empresaTurismo) {
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
            System.out.println("Valor base por noche: " + alojamientoEncontrado.getValorBaseNoche());
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
            System.out.println(" \n");
        } else {
            System.out.println("El rut ingresado no existe en nuestros registros, favor intente con otro. \n");
        }

    }


    public String totalAdicional(String rut) {
        MedioDeAlojamiento alojamientoEncontrado = null;
        for (MedioDeAlojamiento alojamiento : empresaTurismo) {
            if (alojamiento.getDatosCliente().getRut().compareToIgnoreCase(rut) == 0) {
                alojamientoEncontrado = alojamiento;
                break;
            }
        }
        if (alojamientoEncontrado == null) {
            return "No se pudo calcular debido a que el rut ingresado no existe en nuestros registros, favor intente con otro. \n";
        }
        int totalAdicional = 0;
        for (MedioDeAlojamiento alojamiento : empresaTurismo) {
            if (alojamiento.getDatosCliente().getRut().equalsIgnoreCase(rut) && alojamiento instanceof Hotel) {
                totalAdicional += ((Hotel) alojamiento).adicional();
            }
        }
        return String.valueOf(totalAdicional);
    }


    public String totalBonoDescuento(String rut) {
        MedioDeAlojamiento alojamientoEncontrado = null;
        for (MedioDeAlojamiento alojamiento : empresaTurismo) {
            if (alojamiento.getDatosCliente().getRut().compareToIgnoreCase(rut) == 0) {
                alojamientoEncontrado = alojamiento;
                break;
            }
        }
        if (alojamientoEncontrado == null) {
            return "No se pudo calcular debido a que el rut ingresado no existe en nuestros registros, favor intente con otro. \n";
        }
        int totalBonoDescuento = 0;
        for (MedioDeAlojamiento alojamiento : empresaTurismo) {
            if (alojamiento.getDatosCliente().getRut().equalsIgnoreCase(rut)) {
                totalBonoDescuento += alojamiento.bonoDescuento();
            }
        }
        return String.valueOf(totalBonoDescuento);
    }


    public int totalMediosAlojamiento() {
        return empresaTurismo.size();
    }


    public String valorAPagarCliente(String rut) {
        MedioDeAlojamiento alojamientoEncontrado = null;
        for (MedioDeAlojamiento alojamiento : empresaTurismo) {
            if (alojamiento.getDatosCliente().getRut().compareToIgnoreCase(rut) == 0) {
                alojamientoEncontrado = alojamiento;
                break;
            }
        }
        if (alojamientoEncontrado == null) {
            return "No se pudo calcular debido a que el rut ingresado no existe en nuestros registros, favor intente con otro. \n";
        }
        int totalAPagar = 0;
        for (MedioDeAlojamiento alojamiento : empresaTurismo) {
            if (alojamiento.getDatosCliente().getRut().equalsIgnoreCase(rut)) {
                totalAPagar = alojamiento.valorACancelar();
            }
        }
        return String.valueOf(totalAPagar);
    }


    public String obtenerIncrementoValorBase(String rut) {
        MedioDeAlojamiento alojamientoEncontrado = null;
        for (MedioDeAlojamiento alojamiento : empresaTurismo) {
            if (alojamiento.getDatosCliente().getRut().compareToIgnoreCase(rut) == 0) {
                alojamientoEncontrado = alojamiento;
                break;
            }
        }
        if (alojamientoEncontrado == null) {
            return "No se pudo calcular debido a que el rut ingresado no existe en nuestros registros, favor intente con otro. \n";
        }
        int totalIncremento = 0;
        for (MedioDeAlojamiento alojamiento : empresaTurismo) {
            if (alojamiento instanceof Cabagna && alojamiento.getDatosCliente().getRut().equals(rut)) {
                totalIncremento = ((Cabagna) alojamiento).incrementaValorBase();
            }
        }
        return String.valueOf(totalIncremento);
    }

}
