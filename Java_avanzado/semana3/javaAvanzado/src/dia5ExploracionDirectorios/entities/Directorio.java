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
    //inicializando los arrays en los setters (ternario por si no es null , nueva lista)
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

    //metodo auxiliar para imprimir jerarquia en los subdirectorios
    private static void imprimirJerarquia(String nombreCarpetaArchivo, int nivel) {
        String sangria = "";
        int i = 0;
        while (i < nivel) {
            sangria += "--";  // Concatenar "--" en cada nivel
            i++;
        }

        System.out.println(sangria + nombreCarpetaArchivo);
    }
    //recursion para explorar en el directorio
    public static void explorarDirectorio(Directorio directorio, int nivel){
        // Para imprimir el directorio actual
        imprimirJerarquia("Directorio: " + directorio.getNombre(), nivel);
        // Procesar los archivos
        //si no esta vacio imprime la jerarquia de cada archivo
        if (!directorio.archivos.isEmpty()) {
            directorio.archivos.forEach(archivo -> imprimirJerarquia("Archivo: " + archivo, nivel + 1));
        }
        //recursion
        for (Directorio subdirectorio: directorio.subdirectorios){
            explorarDirectorio(subdirectorio,nivel+1);
        }
    }
    //tostring
    @Override
    public String toString() {
        return "Directorio: nombre "+nombre+", subdirectorios "+subdirectorios+", archivos " + archivos;
    }
}
