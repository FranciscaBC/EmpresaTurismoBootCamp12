package vista;

import controlador.EmpresaTurismo;
import modelo.*;

import java.util.ArrayList;

public class smoke_tests {

    public static void smoke_tests(String[] args) {
        EmpresaTurismo empresaTurismo = new EmpresaTurismo(new ArrayList<>());

        Carpa carpa = new Carpa(new DatosCliente("Francisca Benavides", "18326662-4"), 8, 20000, "media", 8);
        Hotel hotel = new Hotel(new DatosCliente("Nobara Cat", "20222554-8"), 50000, 15, "baja", true, 2, false);
        Cabagna cabagna = new Cabagna(new DatosCliente("Gaston Antonio", "20222553-9"), 60000, 8, "media", true, 6, true);

        empresaTurismo.ingresarAlojamientoCarpa(carpa);
        empresaTurismo.ingresarAlojamientoHotel(hotel);
        empresaTurismo.ingresarAlojamientoCabagna(cabagna);


    }


}

