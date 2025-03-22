
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

                case 2 :

                    if (nombreProductos.isEmpty()){
                        System.out.println("No hay productos en el inventario.");
                    }else {

                        System.out.println("/n ***Lista de Productos");

                        for (int i = 0; i <nombreProductos.size();i++){
                            System.out.println("Producto: " + nombreProductos.get(i) +
                                    ", Cantidad: " + cantidadesProductos.get(i) +
                                    ", Precio: Q" + precioProductos.get(i) +
                                    ", Precio con IVA: Q" + (precioProductos.get(i) * (1 + Iva)));
                        }




                    }
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del producto a actualizar: ");
                    String nombreActualizar = scanner.nextLine();
                    int indexActualizar = nombreProductos.indexOf(nombreActualizar);
                    if (indexActualizar == -1){
                        System.out.println("Producto no encontrado.");

                    }else {
                        System.out.print("Ingrese la nueva cantidad: ");
                        int nuevaCantidad = scanner.nextInt();
                        scanner.nextLine();

                        cantidadesProductos.set(indexActualizar,nuevaCantidad);
                        System.out.println("Catiddad de productos actualizados");
                    }

                    break;

                case 4 :

                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    int indexEliminar = nombreProductos.indexOf(nombreEliminar);
                    if (indexEliminar== -1){
                        System.out.println("Producto no encontrado.");
                    }else {
                        nombreProductos.remove(indexEliminar);
                        cantidadesProductos.remove(indexEliminar);
                        precioProductos.remove(indexEliminar);
                        System.out.println("Producto eliminado con éxito.");
                    }

                    break;
                    








            }
        }





    }
}