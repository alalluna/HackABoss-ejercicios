package codeaConmigoAutosRecursion;

import codeaConmigoAutosRecursion.entities.Auto;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Auto> autos = Arrays.asList(
          new Auto(1,"Dacia", "Jogger",30000),
                new Auto(2,"Dacia", "Jogger",30000),
                new Auto(3,"Ford", "Fiesta",135000),
                new Auto(4,"Mercedes", "Benz",10000),
                new Auto(5,"Renault", "Megane",150000)
        );
        // Calcular el total de kilómetros (lista, indice, comienzo del acumulador)
        int totalKilometers = Auto.calculateTotalKilometers(autos, 0, 0);
        System.out.println("Total kilómetros recorridos: " + totalKilometers);

        // Buscar un auto por marca
        String brandToSearch = "Dacia";
        Auto autoSearch = Auto.findAutoByBrand(autos, brandToSearch, 0);
        if (autoSearch != null) {
            System.out.println("Automovil encontrado: " + autoSearch);
        } else {
            System.out.println("No se encontró ningún automovil con la marca " + brandToSearch);
        }

        // Buscar un auto por marca que no existe
        String brandToSearch2 = "Toyota";
        Auto autoSearch2 = Auto.findAutoByBrand(autos, brandToSearch2, 0);
        if (autoSearch2 != null) {
            System.out.println("Automovil encontrado: " + autoSearch2);
        } else {
            System.out.println("No se encontró ningún automovil con la marca " + brandToSearch2);
        }
    }
}
