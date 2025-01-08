package dia4ConcesionarioAutos;
import dia4ConcesionarioAutos.entities.Auto;
import dia4ConcesionarioAutos.utils.InventarioAutos;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventarioAutos<Auto> inventario = new InventarioAutos<>();

        //Creo unos cuantos autos
        Auto auto1 = new Auto("Toyota", "Corolla", 2020, 20000.00);
        Auto auto2 = new Auto("Toyota", "Corolla", 2021, 22000.00);
        Auto auto3 = new Auto("Honda", "Civic", 2019, 18000.00);
        Auto auto4 = new Auto("Honda", "Civic", 2018, 16000.00);
        Auto auto5 = new Auto("Dacia", "Jogger", 2020, 18000.00);
        Auto auto6 = new Auto("Dacia", "Jogger", 2025, 30000.00);
        Auto auto7 = new Auto("Mercedes", "Benz", 2021, 60000.00);
        Auto auto8 = new Auto("Ford", "Sync", 2019, 30000.00);
        Auto auto9 = new Auto("Ford", "Sync", 2017, 29000.00);
        Auto auto10 = new Auto("Ford", "Fiesta", 2024, 28000.00);
        Auto auto11 = new Auto("Ford", "Fiesta", 2015, 10000.00);
        Auto auto12= new Auto("Mercedes", "Benz", 2010, 15000.00);

        //los añado al inventario
        inventario.introducirAuto(auto1);
        inventario.introducirAuto(auto2);
        inventario.introducirAuto(auto3);
        inventario.introducirAuto(auto4);
        inventario.introducirAuto(auto5);
        inventario.introducirAuto(auto6);
        inventario.introducirAuto(auto7);
        inventario.introducirAuto(auto8);
        inventario.introducirAuto(auto9);
        inventario.introducirAuto(auto10);
        inventario.introducirAuto(auto11);
        inventario.introducirAuto(auto12);

        //inicio el escanner
        Scanner scanner = new Scanner(System.in);
        //la variable salir para deshacer el bucle
        boolean salir = false;
        //while para inicir la captura e interaccion de datos
        while (!salir) {
            //estas son las opciones
            System.out.println("\nMenú de Inventario de Automoviles");
            System.out.println("1. Introducir un automovil");
            System.out.println("2. Buscar automoviles por criterio");
            System.out.println("3. Calcular valor total del inventario");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // para hacer el salto de línea
            //le especifico las opciones posibles dentro del programa con switch case
            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce la marca del automovil: ");
                    String marca = scanner.nextLine();
                    System.out.print("Introduce el modelo del automovil: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Introduce el año del automovil(ejemplo 2025): ");
                    int anyo = scanner.nextInt();
                    System.out.print("Introduce el precio del automovil (ejemplo 30000,0): ");
                    double precio = scanner.nextDouble();

                    //llamo al metodo para introducir un automovil
                    Auto auto = new Auto(marca, modelo, anyo, precio);
                    inventario.introducirAuto(auto);
                }
                case 2 -> {
                    //en los sout especifico los valores blancos para un correcto filtrado
                    System.out.print("Introduce la marca (deja en blanco para no filtrar): ");
                    String marca = scanner.nextLine();
                    System.out.print("Introduce el modelo (deja en blanco para no filtrar): ");
                    String modelo = scanner.nextLine();
                    System.out.print("Introduce el año (escribe 0 para no filtrar): ");
                    int anyo = scanner.nextInt();
                    System.out.print("Introduce el precio (escribe 0,0 para no filtrar): ");
                    double precio = scanner.nextDouble();

                    //llamo al metodo filtrar
                    List<Auto> resultados = inventario.filtrar(marca, modelo, anyo, precio);
                    System.out.println("\nResultados de la búsqueda");
                    //le ofrezco las dos posibilidades, si hay o no datos
                    if (resultados.isEmpty()) {
                        System.out.println("No se encontraron automoviles con estos criterios.");
                    } else {
                        //para imprimir los resultados del filtro
                        resultados.forEach(System.out::println);
                    }
                }
                case 3 -> {
                    //llamo al metodo valor total
                    double valorTotal = inventario.valorTotal();
                    System.out.println("El valor total es: $" + valorTotal);
                }
                case 4 -> {
                    //llamo al metodo mostrar inventario
                    System.out.println("\nInventario Actual");
                    inventario.mostrarInventario();
                }
                case 5 -> {
                    //bolean true para salir
                    salir = true;
                    System.out.println("Saliendo del sistema.");
                }
                //mensaje de error para la introduccion de otros valores
                default -> System.err.println("Opción no válida. Intenta de nuevo.");
            }
        }
        scanner.close();
    }
}
