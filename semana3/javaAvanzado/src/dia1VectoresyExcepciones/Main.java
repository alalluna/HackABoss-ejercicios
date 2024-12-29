package dia1VectoresyExcepciones;

import dia1VectoresyExcepciones.entities.Vector;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(3);

        // Asigna valores de 0 y 1 al vector manualmente
        vector.storeData(1);  // Asigna 1 en el índice 0
        vector.storeData(0);  // Asigna 0 en el índice 1
        vector.storeData(1);  // Asigna 1 en el índice 2

        // Muestra el estado del vector después de asignar los valores
        System.out.println("Vector after storing values: ");
        System.out.println(vector.toString());

        // Accede a los elementos en el vector
        System.out.println("Accessing data at index 0: " + vector.accessData(0));
        System.out.println("Accessing data at index 1: " + vector.accessData(1));
        System.out.println("Accessing data at index 2: " + vector.accessData(2));
    }
}
