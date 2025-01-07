package dia4ConcesionarioAutos.utils;

import dia4ConcesionarioAutos.entities.Auto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
//utils inventario debe de extender de auto para que solo puedan añadirse objetos de tipo auto
//uso el generico T de type para crear una lista generica y despues crear inventario
public class InventarioAutos<T extends Auto> {
    private final List<T> inventario;

//    public InventarioAutos(List<T> inventario) {
//        this.inventario = inventario;
//    }

    // Constructor
    public InventarioAutos() {
        this.inventario = new ArrayList<>();//inicilizo la lista ya
    }

    // Metodo genérico para agregar autos al inventario
    public void introducirAuto(T auto) {
        //si es nulo lanzo excepcion
        if (auto == null) {
            throw new IllegalArgumentException("El auto no puede ser nulo.");
        }
        if (inventario.contains(auto)) {
            //si ya existe lo notifico
            System.out.println("El auto ya está en el inventario.");
            return;
        }
        inventario.add(auto);
    }
    // Metodo genérico para buscar autos por un criterio específico (marca o año)
    public List<T> filtrar(String marca, String modelo, int anyo, double precio) {
        return inventario.stream()
                //para que filtre si no estan vacios ignorando mayusculas
                .filter(auto -> marca.isEmpty() || auto.getMarca().equalsIgnoreCase(marca))
                .filter(auto -> modelo.isEmpty() || auto.getModelo().equalsIgnoreCase(modelo))
                //para que filtre si no es 0
                .filter(auto -> anyo == 0 || auto.getAnyo() == anyo)
                .filter(auto -> precio == 0 || auto.getPrecio() == precio)
                .toList();
    }

    // Metodo genérico para calcular el valor total del inventario
    public double valorTotal() {
        return inventario.stream()
                .mapToDouble(Auto::getPrecio)//para mapear los precios
                .sum(); //y despues sumarlos
    }

    // Metodo para mostrar el inventario
    public void mostrarInventario() {
        if (inventario.isEmpty()) {
            //mensaje por si noy datos
            System.out.println("El inventario está vacío.");
        } else {
            //imprimir
            inventario.forEach(System.out::println);
        }
    }
}
