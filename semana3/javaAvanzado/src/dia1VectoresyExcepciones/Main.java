package dia1VectoresyExcepciones;

import dia1VectoresyExcepciones.entities.Vector;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(3);

        // Asigno valores
        vector.storeData(1);  // Asigna 1 en el índice 0
        vector.storeData(0);  // Asigna 0 en el índice 1
        vector.storeData(1);  // Asigna 1 en el índice 2

        // Muestro el estado del vector
        System.out.println(vector.toString());

        //como captar la excepcion propia de java(copiado de la correccion)
        try {
            System.out.println(vector.accessData(-1));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(vector.accessData(11));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
