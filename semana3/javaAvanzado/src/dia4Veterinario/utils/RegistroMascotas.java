package dia4Veterinario.utils;

import dia4Veterinario.entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RegistroMascotas<T extends Mascota<?>> {
    //Lista generica T
    private List<T> registro;

    // Constructor, inicializando la lista
    public RegistroMascotas() {
        this.registro = new ArrayList<>();
    }

    //metodos

    // Introducir Mascota al registro
    public void introducirMascota(T mascota) {
        //si es nulo
        if (mascota == null) {
            throw new IllegalArgumentException("La mascota no puede ser nula.");
        }
        //si es valido,para introducir en la lista
        registro.add(mascota);
    }

    // Filtrar por nombre o especie
    public List<T> filtrar(String nombre, String especie) {
        return registro.stream()
                // Si el nombre no está vacío, filtra por nombre
                .filter(mascota -> nombre.isEmpty() || mascota.getNombre().equalsIgnoreCase(nombre))
                // Si la especie no está vacía, filtra por especie
                .filter(mascota -> especie.isEmpty() || mascota.getEspecie().equalsIgnoreCase(especie))
                .collect(Collectors.toList());  // Convertir a lista
    }
    // Contar la cantidad total de mascotas registradas
    public int contarMascotas() {
        //size para contar el numero de la lista
        return registro.size();
    }

    // Mostrar todas las mascotas del registro
    public void mostrarRegistro() {
        //si no está vacio se imprimen los resultados del registro
        if (registro.isEmpty()) {
            System.out.println("No hay mascotas registradas.");
        } else {
            //imprimir linea por cada mascota del registro
            for (T mascota : registro) {
                System.out.println(mascota);
            }
        }
    }

    //metodo auxiliar para verificar que el codigo no exista previamente, y asi no repetir codigos
    private boolean codigoExiste(int codigo) {
        // Verificar si el código ya está en la lista de registro
        return registro.stream()
                .anyMatch(mascota -> mascota.getCodigo() == codigo);
    }

    //metodo auxiliar para generar un nombre aleatorio
    private String generarNombreAleatorio(int longitud) {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"; // Letras posibles
        StringBuilder nombre = new StringBuilder();
        Random random = new Random();

        return random.ints(longitud, 0, letras.length()) // Genera una secuencia de índices aleatorios
                .mapToObj(letras::charAt)          // Convierte cada índice en un carácter
                .collect(StringBuilder::new,           // Usa StringBuilder para acumular caracteres
                        StringBuilder::append,
                        StringBuilder::append)        // Combina los resultados
                .toString();
    }

    //metodo para generar mascotas aleatoriamente
    public void generarMascotaAleatoria() {
        Random random = new Random();
        String[] especies = {"Perro", "Gato", "Reptil", "Pajaro"}; // Especies hijas de Mascota

        // Generar un código único
        int codigo = 1000 + random.nextInt(9000);
        while (codigoExiste(codigo)) { // Mientras el código exista
            codigo = 1000 + random.nextInt(9000); // Generar codigo
        }

        // un nombre aleatorio de x letras
        String nombre = generarNombreAleatorio(6);

        // Una especie aleatoria de la lista especies
        String especie = especies[random.nextInt(especies.length)];

        // edad aleatoria entre 0 y 20 años
        int edad = random.nextInt(21);

        //Nueva instancia de Mascota
        Mascota<?> nuevaMascota = new Mascota<>(codigo, nombre, edad, especie);

        // Agregar la mascota generada
        introducirMascota((T) nuevaMascota);

        System.out.println("Mascota generada aleatoriamente: " + nuevaMascota);
    }
}
