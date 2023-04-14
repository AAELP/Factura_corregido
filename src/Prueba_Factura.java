import java.io.PrintStream;
import java.util.Scanner;

public class Prueba_Factura {
    public Prueba_Factura() {
    }

    public static void main(String[] args) {
        Factura f1 = new Factura();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero del articulo");
        int numeroArticulo = Integer.parseInt(sc.next());
        f1.setNumeroArticulo(numeroArticulo);
        System.out.println("Nombre del cliente: ");
        String nombre = sc.next();
        f1.setNombre(nombre);
        System.out.println("Numero de cedula del cliente: ");
        String cedula = sc.next();
        f1.setCedula(cedula);
        System.out.println("Ingrese descripcion del Articulo: ");
        String descripcionArticulo = sc.next();
        f1.setDescripcionElemento(descripcionArticulo);
        System.out.println("Ingrese catidad de productos:");
        int cantidadArticulo = Integer.parseInt(sc.next());
        f1.setNumeroElementos(cantidadArticulo);
        System.out.println("Ingrese el valor por unidad:");
        double precioPorArticulo = Double.parseDouble(sc.next());
        f1.setValorUnidad(precioPorArticulo);
        System.out.println("Nombre:" + f1.getNombre());
        System.out.println("Cedula:" + f1.getCedula());
        System.out.println("Numero de Articulo:" + f1.getNumeroArticulo());
        System.out.println("Descripcion Sticulo: " + f1.getDescripcionElemento());
        System.out.println("Cantidad de articulos: " + f1.getNumeroElementos());
        System.out.println("Valor por unidad: $" + f1.getValorUnidad());
        PrintStream var10000 = System.out;
        int var10001 = f1.getNumeroElementos();
        var10000.println("Total por los" + var10001 + "de" + f1.getDescripcionElemento() + "es de $" + f1.CalculoValorTotalPorPieza());
    }
}