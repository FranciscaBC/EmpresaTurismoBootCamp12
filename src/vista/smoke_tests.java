package vista;
import modelo.*;

public class smoke_tests {

    public static void smoke_tests(String []args){

        Carpa carpa = new Carpa (new DatosCliente("Francisca Benavides", "18326662-4"), 8,20000, "media", 8);

        Hotel hotel = new Hotel(new DatosCliente("Nobara Cat", "20222554-8"), 50000, 15, "baja", true, 2, false);



    }



}
