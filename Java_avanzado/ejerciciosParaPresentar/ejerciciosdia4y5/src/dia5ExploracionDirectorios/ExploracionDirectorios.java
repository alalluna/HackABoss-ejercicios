package dia5ExploracionDirectorios;

import dia5ExploracionDirectorios.entities.Directorio;

import java.util.ArrayList;
import java.util.List;

public class ExploracionDirectorios {
    public static void main(String[] args) {
        //creo la lista de subdirectorios
        List<Directorio> subdirectorios = new ArrayList<>();
        
        // Crear el directorio principal y asignarle subdirectorios y archivos
        Directorio directorioPrincipal = new Directorio("Directorio Principal", subdirectorios, null);
        directorioPrincipal.introducirArchivo("archivo1.psd");
        directorioPrincipal.introducirArchivo("archivo2.txt");

        //los subdirectorios son de la clase directorio pero a las listas hay que ponerles null para que funcione
        // subdirectorio1
        Directorio subdirectorio1 = new Directorio("subdirectorio1", null, null);
        // añadir archivos
        subdirectorio1.introducirArchivo("archivo3.ppt");
        subdirectorio1.introducirArchivo("archivo4.png");
        //lo añado a la lista de subdirectorios mas abajo
        //subdirectorios.add(subdirectorio1);

        // Crear subdirectorio2, añadirle archivos y luego agregarlo a la lista de subdirectorios
        Directorio subdirectorio2 = new Directorio("subdirectorio2", null, null);
        subdirectorio2.introducirArchivo("archivo5.jpg");
        subdirectorios.add(subdirectorio2);

        // Crear subdirectorio3, añadirle archivos y luego agregarlo a la lista de subdirectorios
        Directorio subdirectorio3 = new Directorio("subdirectorio3", null, null);
        subdirectorio3.introducirArchivo("archivo6.pdf");
        subdirectorio3.introducirArchivo("archivo7.docx");
        subdirectorios.add(subdirectorio3);
        // Crear subdirectorio4
        Directorio subdirectorio4 = new Directorio("subdirectorio4", null, null);
        subdirectorio4.introducirArchivo("archivo6.pdf");
        subdirectorio4.introducirArchivo("archivo7.docx");
        subdirectorio1.introducirSubdirectorio(subdirectorio4);

        //no se añade el subdirectorio1 hasta que he integrado el subdirectorio que depende de el
        //no poner numeros en clases ni variables
        subdirectorios.add(subdirectorio1);


        // Explorar el directorio principal
        Directorio.explorarDirectorio(directorioPrincipal, 0);

    }
}
