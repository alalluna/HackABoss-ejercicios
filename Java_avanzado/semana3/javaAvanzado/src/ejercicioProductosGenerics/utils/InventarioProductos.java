package ejercicioProductosGenerics.utils;

import ejercicioProductosGenerics.entities.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InventarioProductos<T extends Producto> {
    private final List<T> elementos;

    // Constructor
    public InventarioProductos() {
        this.elementos = new ArrayList<>();
    }

    // Crear un nuevo producto
    public void crear(T elemento) {
        if (elemento == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo.");
        }
        elementos.add(elemento);
    }

    // Leer todos los productos
    public List<T> leerTodos() {
        return new ArrayList<>(elementos); // Retorna una copia para evitar modificaciones externas
    }

    // Buscar un producto por nombre
    public Optional<T> buscarPorNombre(String nombre) {
        return elementos.stream()
                .filter(elemento -> elemento.getNombre().equalsIgnoreCase(nombre))
                .findFirst();
    }

    // Actualizar un producto
    public boolean actualizar(String nombre, T nuevoElemento) {
        for (int i = 0; i < elementos.size(); i++) {
            if (elementos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                elementos.set(i, nuevoElemento);
                return true;
            }
        }
        return false; // No se encontró el producto para actualizar
    }

    // Eliminar un producto por nombre
    public boolean eliminarPorNombre(String nombre) {
        return elementos.removeIf(elemento -> elemento.getNombre().equalsIgnoreCase(nombre));
    }

    // Contar el total de productos
    public int contar() {
        return elementos.size();
    }
}
