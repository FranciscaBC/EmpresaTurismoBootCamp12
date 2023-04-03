package vista;
import modelo.Carpa;
import modelo.DatosCliente;
import modelo.Hotel;
import modelo.Cabagna;

public class App {

    public static void main(String []args){
        //Constructor
        Carpa carpa = new Carpa(new DatosCliente("Francisca Benavides", "18326662-4"), 8, 12.000, "media", 2 );

        Carpa carpa2 = new Carpa();

        Hotel hotel = new Hotel();

        System.out.println(hotel.subTotal());

        Cabagna cabagna = new Cabagna();

        System.out.println(cabagna.bonoDescuento());

        System.out.println(carpa.subTotal());

        System.out.println(carpa2.subTotal());

    }



}
