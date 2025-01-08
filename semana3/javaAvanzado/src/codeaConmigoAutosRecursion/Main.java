package codeaConmigoAutosRecursion;

import codeaConmigoAutosRecursion.entities.Car;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
          new Car(1,"Dacia", "Jogger",30000),
                new Car(2,"Dacia", "Jogger",30000),
                new Car(3,"Ford", "Fiesta",135000),
                new Car(4,"Mercedes", "Benz",10000),
                new Car(5,"Renault", "Megane",150000)
        );
        // Calcular el total de kilómetros (lista, indice, comienzo del acumulador)
        int totalKilometers = Car.calculateTotalKilometers(cars, 0, 0);
        System.out.println("Total kilómetros recorridos: " + totalKilometers);

        // Buscar un auto por marca
        String brandToSearch = "Dacia";
        Car carSearch = Car.findAutoByBrand(cars, brandToSearch, 0);
        if (carSearch != null) {
            System.out.println("Automovil encontrado: " + carSearch);
        } else {
            System.out.println("No se encontró ningún automovil con la marca " + brandToSearch);
        }

        // Buscar un auto por marca que no existe
        String brandToSearch2 = "Toyota";
        Car carSearch2 = Car.findAutoByBrand(cars, brandToSearch2, 0);
        if (carSearch2 != null) {
            System.out.println("Automovil encontrado: " + carSearch2);
        } else {
            System.out.println("No se encontró ningún automovil con la marca " + brandToSearch2);
        }
    }
}
