
package dia4Veterinario;

import dia4Veterinario.entities.Mascota;
import dia4Veterinario.utils.RegistroMascotas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RegistroMascotas<Mascota<?>> registro = new RegistroMascotas<>();

        // Lista de mascotas
        //no lo hagas con vectores, hazlo con listas
        List<Mascota<?>> mascotas = new ArrayList<>();
        mascotas.add(new Mascota<>(1001, "Dari", 1, "Perro"));
        mascotas.add(new Mascota<>(1002, "Cruela", 1, "Reptil"));
        mascotas.add(new Mascota<>(1003, "Damian", 1, "Gato"));
        mascotas.add(new Mascota<>(1004, "Bolson", 1, "Pajaro"));
        mascotas.add(new Mascota<>(1005, "Chase", 1, "Reptil"));
        mascotas.add(new Mascota<>(1006, "Rob", 1, "Perro"));
        mascotas.add(new Mascota<>(1007, "Lancel", 1, "Pajaro"));
        mascotas.add(new Mascota<>(1008, "Miri", 1, "Gato"));

        // Añadir mascotas al registro for each
        for (Mascota<?> mascota : mascotas) {
            registro.introducirMascota(mascota);
        }

        // Contar el total de mascotas registradas
        int totalMascotas = registro.contarMascotas();
        System.out.println("Total de mascotas registradas: " + totalMascotas);
        System.out.println("\n");

        // Filtrar mascotas por nombre
        System.out.println("Filtrar por nombre");
        var filtrarPorNombre = registro.filtrar("Dari", "");
        filtrarPorNombre.forEach(System.out::println);  // Imprimir
        System.out.println("\n");

        // Filtrar mascotas por especie
        System.out.println("Filtrar por especie");
        var filtrarPorEspecie = registro.filtrar("", "Gato");
        filtrarPorEspecie.forEach(System.out::println);
        System.out.println("\n");

        // Generar mascotas aleatorias y añadirlas al registro
        System.out.println("Generando mascotas aleatorias");
            registro.generarMascotaAleatoria();


        // Mostrar todas las mascotas registradas
        System.out.println("Registro de Mascotas");
        registro.mostrarRegistro();
    }
}

