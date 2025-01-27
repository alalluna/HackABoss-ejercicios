package dia5ExploracionDirectorios;

import dia5ExploracionDirectorios.entities.Directorio;

import java.util.Arrays;

public class ExploracionDirectorios {
    public static void main(String[] args) {
            //creando archivos
        String archivo1 = "archivo1.psd";
        String archivo2 = "archivo2.txt";
        String archivo3 = "archivo3.ppt";
        String archivo4 = "archivo4.png";
        String archivo5 = "archivo5.jpg";
        String archivo6 = "archivo6.pdf";
            //creando subdirectorios
        Directorio subdirectorio = new Directorio("Subdirectorio1", null, Arrays.asList(archivo1, archivo2));
        Directorio subdirectorio2 = new Directorio("Subdirectorio2", null, Arrays.asList(archivo3, archivo4));
        Directorio subdirectorio3 = new Directorio("Subdirectorio3", null, Arrays.asList(archivo5));
        Directorio subdirectorio4 = new Directorio("Subdirectorio4", null, Arrays.asList(archivo6));

            // Crear directorio principal con subdirectorios y archivos
        Directorio directorioPrincipal = new Directorio("Directorio Principal",
                Arrays.asList(subdirectorio,subdirectorio2, subdirectorio3, subdirectorio4),
                Arrays.asList(archivo1, archivo2, archivo3, archivo4, archivo5, archivo6));

        // Imprimir la jerarquía de directorios y archivos
        Directorio.explorarDirectorio(directorioPrincipal, 0);
    }
}
