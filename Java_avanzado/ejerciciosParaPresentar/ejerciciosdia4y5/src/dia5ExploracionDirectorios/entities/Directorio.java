package dia5ExploracionDirectorios.entities;

import java.util.ArrayList;
import java.util.List;

public class Directorio {
    private String nombre;
    private List<Directorio> subdirectorios;
    private List<String> archivos;

    //constructor
    //llamo a los set donde estan inicializados los arrays
    public Directorio(String nombre, List<Directorio> subdirectorios, List<String> archivos) {
        this.nombre = nombre;
        setSubdirectorios(subdirectorios);
        setArchivos(archivos);
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }
    //inicializando los arrays en los setters (ternario por si no es null, nueva lista)
    public void setSubdirectorios(List<Directorio> subdirectorios) {
        this.subdirectorios=subdirectorios != null ? subdirectorios : new ArrayList<>();
    }

    public List<String> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<String> archivos) {
        this.archivos = archivos !=null ? archivos : new ArrayList<>();
    }

    //metodos
    //para introducir un subdirectorio
    public void introducirSubdirectorio(Directorio subdirectorio){
        this.subdirectorios.add(subdirectorio);
    }

    //para introducir un archivo
    public void introducirArchivo(String archivo){
        this.archivos.add(archivo);
    }

    // Generar el tabulador recursivamente
    private static String generarTabulador(int nivel) {
        // Caso base: si no hay más niveles, no se genera tabulación
        if (nivel == 0) {
            return "- ";
        }
        // Recursion: agrega "-- " y reduce el nivel, aproximandose a la base
        return "-- " + generarTabulador(nivel - 1);
    }

    // Imprimir la jerarquía de directorios
    private static void imprimirJerarquia(String nombreCarpetaArchivo, int nivel) {
        // Generar tabulacion
        String tabulador = generarTabulador(nivel);
        // Imprimir la jerarquía con el tabulador generado
        System.out.println(tabulador + nombreCarpetaArchivo);
    }

    // Metodo para explorar en el directorio
    public static void explorarDirectorio(Directorio directorio, int nivel) {
        // Para imprimir el directorio actual
        imprimirJerarquia("Directorio: " + directorio.getNombre(), nivel);

        // Procesar los archivos si existen
        if (!directorio.archivos.isEmpty()) {
            // Recorrer la lista de archivos y llamar recursivamente a imprimirJerarquia
            directorio.archivos.forEach(archivo -> imprimirJerarquia("// " + archivo, nivel + 1));
        }

        // Recursion para repasar los subdirectorios
        if (!directorio.subdirectorios.isEmpty()) {
            directorio.subdirectorios.forEach(subdirectorio -> explorarDirectorio(subdirectorio, nivel + 1));
        }
    }

    //tostring
    @Override
    public String toString() {
        return "Directorio: nombre "+nombre+", subdirectorios "+subdirectorios+", archivos " + archivos;
    }
}
