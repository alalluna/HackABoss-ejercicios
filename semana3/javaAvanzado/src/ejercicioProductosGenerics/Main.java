package ejercicioProductosGenerics;
import ejercicioProductosGenerics.entities.*;
import ejercicioProductosGenerics.utils.InventarioProductos;

public class Main {
    public static void main(String[] args) {
        InventarioProductos<Producto> crud = new InventarioProductos<>();

        // Crear productos
        crud.crear(new Electrico("Lámpara", 29.99, "MarcaX"));
        crud.crear(new Ropa("Camiseta", 19.99, "M", "Algodón"));

        // Leer todos los productos
        System.out.println("Productos registrados:");
        crud.leerTodos().forEach(System.out::println);

        // Buscar producto por nombre
        System.out.println("\nBuscando 'Lámpara':");
        crud.buscarPorNombre("Lámpara").ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Producto no encontrado.")
        );

        // Actualizar un producto
        System.out.println("\nActualizando 'Lámpara':");
        boolean actualizado = crud.actualizar("Lámpara", new Electrico("Lámpara LED", 34.99, "MarcaY"));
        System.out.println(actualizado ? "Producto actualizado." : "Producto no encontrado.");
        crud.leerTodos().forEach(System.out::println);

        // Eliminar un producto
        System.out.println("\nEliminando 'Camiseta':");
        boolean eliminado = crud.eliminarPorNombre("Camiseta");
        System.out.println(eliminado ? "Producto eliminado." : "Producto no encontrado.");
        crud.leerTodos().forEach(System.out::println);

        // Contar productos
        System.out.println("\nTotal de productos registrados: " + crud.contar());
    }
}
