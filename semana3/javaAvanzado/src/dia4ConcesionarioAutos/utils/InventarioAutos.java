//package dia4ConcesionarioAutos.utils;
//
//import dia4ConcesionarioAutos.entities.Auto;
//
//import java.util.ArrayList;
//import java.util.List;
////utils inventario debe de extender de auto para que solo puedan añadirse objetos de tipo auto
////uso el generico T de type para crear una lista generica y despues crear inventario
//public class InventarioAutos<T extends Auto> {
//    private final List<T> inventario;
//
//    // Constructor
//    public InventarioAutos() {
//        this.inventario = new ArrayList<>();//inicializo la lista ya
//    }
//
//    // Metodo genérico para agregar autos al inventario
//    public void introducirAuto(T auto) {
//        //si es nulo lanzo excepcion
//        if (auto == null) {
//            throw new IllegalArgumentException("El auto no puede ser nulo.");
//        }else {
//            inventario.add(auto);
//            System.out.println(auto.getMarca() +" "+ auto.getModelo()+ " introducido correctamente: ");
//        }
//    }
//    // Metodo genérico para buscar autos por un criterio específico (marca o año, aunque yo he puesto todos)
//    public List<T> filtrar(String marca, String modelo, int anyo, double precio) {
//        return inventario.stream()
//                //para que filtre si no estan vacios ignorando mayusculas
//                .filter(auto -> marca.isEmpty() || auto.getMarca().equalsIgnoreCase(marca))
//                .filter(auto -> modelo.isEmpty() || auto.getModelo().equalsIgnoreCase(modelo))
//                //para que filtre si no es 0
//                .filter(auto -> anyo == 0 || auto.getAnyo() == anyo)
//                .filter(auto -> precio == 0 || auto.getPrecio() == precio)
//                .toList();//en mi intell me deja hacer tolist pero hace lo mismo que el collect(collectors..)
//    }
//
//    // Metodo genérico para calcular el valor total del inventario
//    public double valorTotal() {
//        return inventario.stream()
//                .mapToDouble(Auto::getPrecio)//para mapear los precios (son datos double)
//                .sum(); //y despues sumarlos
//    }
//
//    // Metodo para mostrar el inventario
//    public void mostrarInventario() {
//        if (inventario.isEmpty()) {
//            //mensaje por si noy datos
//            System.out.println("El inventario está vacío.");
//        } else {
//            //imprimir
//            inventario.forEach(System.out::println);
//        }
//    }
//}
