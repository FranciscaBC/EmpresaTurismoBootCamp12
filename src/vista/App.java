package vista;
import modelo.*;

public class App {

    public static void main(String []args){

        Carpa carpa = new Carpa (new DatosCliente("Francisca Benavides", "18326662-4"), 8,20000, "media", 8);

        Hotel hotel = new Hotel(new DatosCliente("Nobara Cat", "20222554-8"), 50000, 15, "baja", true, 2, false);

        Cabagna cabagna = new Cabagna(new DatosCliente("Ricardo Nuñez", "17625542-K"), 40000, 5,"media", false, 8, true);;

        System.out.println("El subtotal de la cabaña es: $"+cabagna.subTotal());
        System.out.println("El bono de descuento de la cabaña es: $"+cabagna.bonoDescuento());
        System.out.println("El total a pagar de la cabaña es: $"+cabagna.valorACancelar());
        System.out.println("El incremento en el valor base es de: $"+cabagna.incrementaValorBase());

    }



}
