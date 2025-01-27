package dia4Veterinario;

import dia4Veterinario.entities.Mascota;
import dia4Veterinario.utils.RegistroMascotas;

public class Main {
    public static void main(String[] args) {
        RegistroMascotas<Mascota<?>> registro = new RegistroMascotas<>();

        // Lista de mascotas
        Mascota<?>[] mascotas = {
                new Mascota<>(1,"Dari",1,"Perro"),
                new Mascota<>(2,"Cruela",1,"Reptil"),
                new Mascota<>(3,"Damian",1,"Gato"),
                new Mascota<>(4,"Bolson",1,"Pajaro"),
                new Mascota<>(5,"Chase",1,"Reptil"),
                new Mascota<>(6,"Rob",1,"Perro"),
                new Mascota<>(7,"Lancel",1,"Pajaro"),
                new Mascota<>(8,"Miri",1,"Gato")
        };

        // Añadir mascotas al registro for each
        for (Mascota<?> mascota : mascotas) {
            registro.introducirMascota(mascota);
        }

        // Mostrar todas las mascotas registradas
        System.out.println("Registro de Mascotas");
        registro.mostrarRegistro();
        System.out.println("\n");

        // Contar el total de mascotas registradas
        int totalMascotas = registro.contarMascotas();
        System.out.println("Total de mascotas registradas: " + totalMascotas);
        System.out.println("\n");

        // Filtrar mascotas por nombre
        System.out.println("Filtrar por nombre");
        var filtrarPorNombre = registro.filtrar("Dari", "");  // Solo por nombre
        filtrarPorNombre.forEach(System.out::println);  // Imprimir
        System.out.println("\n");

        // Filtrar mascotas por especie
        System.out.println("Filtrar por especie");
        var filtrarPorEspecie = registro.filtrar("", "Gato");  // Solo por especie
        filtrarPorEspecie.forEach(System.out::println);
        System.out.println("\n");

        // Generar mascotas aleatorias y agregarlas al registro
        System.out.println("Generando mascotas aleatorias");
        registro.generarMascotaAleatoria();
    }
}
