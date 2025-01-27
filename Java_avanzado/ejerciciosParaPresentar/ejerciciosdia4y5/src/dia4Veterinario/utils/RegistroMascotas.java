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
        if (mascota != null) {
            //si es valido,para introducir en la lista
            registro.add(mascota);
        }else{
            throw new IllegalArgumentException("La mascota no puede ser nula.");
        }

    }

    // Filtrar por nombre o especie
    public List<T> filtrar(String nombre, String especie) {
        return registro.stream()
                // Si el nombre no está vacío, filtra por nombre
                .filter(mascota -> nombre.isEmpty() || mascota.getNombre().equalsIgnoreCase(nombre))
                // Si la especie no está vacía, filtra por especie
                .filter(mascota -> especie.isEmpty() || mascota.getEspecie().equalsIgnoreCase(especie))
                .collect(Collectors.toList());  // Convertir a lista con collect
    }
    // Contar la cantidad total de mascotas registradas
    public int contarMascotas() {
        //size para contar el numero de la lista
        return registro.size();
    }

    // Mostrar todas las mascotas del registro
    public void mostrarRegistro() {
        //si no está vacio se imprimen los resultados del registro
        if (!registro.isEmpty()) {
            //imprimir linea por cada mascota del registro
            for (T mascota : registro) {
                System.out.println(mascota);
            }
        } else {
            System.out.println("No hay mascotas registradas.");
            }

    }

    //metodo para verificar que el codigo no exista previamente, y asi no repetir codigos
    private boolean codigoExiste(int codigo) {
        // Verificar si el código ya está en la lista de registro
        return registro.stream()
                .anyMatch(mascota -> mascota.getCodigo() == codigo);
    }
    //generar un codigo unico
    private int generarCodigoUnico() {
        Random random = new Random();
        int codigo = 1000 + random.nextInt(9000);
        while (codigoExiste(codigo)) {
            codigo = 1000 + random.nextInt(9000);
        }
        return codigo;
    }

    // generar un nombre aleatorio
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

    //metodo para generar especie aleatoria
    //utiliza una lista en lugar de un vector
    private String generarEspecieAleatoria() {
    ArrayList<String> especies = new ArrayList<>();
    especies.add("Perro");
    especies.add("Gato");
    especies.add("Reptil");
    especies.add("Pajaro");
        Random random = new Random();
        return especies.get(random.nextInt(especies.size()));
    }
    /*private String generarEspecieAleatoria() {
        String[] especies = {"Perro", "Gato", "Reptil", "Pajaro"};
        Random random = new Random();
        return especies[random.nextInt(especies.length)];
    }*/
    //metodo para generar edad aleatoria
    private int generarEdadAleatoria() {
        Random random = new Random();
        return random.nextInt(21); // Edad entre 0 y 20 años
    }
    //metodo para generar mascotas aleatoriamente
    //no deberia haber casteo pero tal y como lo he planteado intell me pide el casteo
    public void generarMascotaAleatoria() {
        int codigo = generarCodigoUnico();
        String nombre = generarNombreAleatorio(6);
        String especie = generarEspecieAleatoria();
        int edad = generarEdadAleatoria();
        //he quitado el casteo y he creado una nueva masota y la he añadido a la lista reutilizando el metodo introducir
        // Crear la nueva mascota
        T nuevaMascota = (T) new Mascota<>(codigo, nombre, edad, especie);
        introducirMascota(nuevaMascota);
        System.out.println("Mascota generada aleatoriamente: " + nuevaMascota);

        // Añadir al registro
//        registro.add((T) nuevaMascota);

    }
}
