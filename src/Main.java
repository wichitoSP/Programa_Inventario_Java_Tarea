
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double Iva = 0.12;
        ArrayList<String> nombreProductos = new ArrayList<>();
        ArrayList<Integer>cantidadesProductos = new ArrayList<>();
        ArrayList<Double>precioProductos = new ArrayList<>();

        while (true){

            System.out.println("***Menú Inventario****");
            System.out.println("1.)Agregar Producto");
            System.out.println("2.)Mostrar Producto");
            System.out.println("3.)Actualizar Cantidad de un Producto");
            System.out.println("4.)Elimiar un producto");
            System.out.println("5.)Salir");
            System.out.println("Seleccione una opción del menu: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){

                case 1 :
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("ingrese la cantidad del producto:");
                    int cantidad = scanner.nextInt();
                    System.out.print("Ingrese el Precio del producto: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine();

                    nombreProductos.add(nombre);
                    cantidadesProductos.add(cantidad);
                    precioProductos.add(precio);

                    System.out.println("Productos agregados correctamente.");

                    break;

                    

            }
        }





    }
}