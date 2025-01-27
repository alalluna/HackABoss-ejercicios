package codeaConmigoAutosRecursion.entities;

import java.util.List;

//entidad
public class Car {
    private int id;
    private String brand;
    private String model;
    private int kilometers;

    //constructor
    public Car(int id, String brand, String model, int kilometers) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.kilometers = kilometers;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    //metodos
    // para calcular kilometros la lista el indice y la suma
    public static int calculateTotalKilometers(List<Car> cars, int index, int totalkms) {
        //if else para la base y el return para recorrer los autos
        // Base
        if (cars.size() == index) {
            return totalkms;
        }
        //recursion
        return calculateTotalKilometers(cars, index + 1, totalkms + cars.get(index).getKilometers());
    }

    //buscar por marca
    public static Car findAutoByBrand(List<Car> cars, String brand, int index) {
        // Base
        if (cars.size() == index) {
            return null; // No se encuentra
        }
        // Si la marca coincide
        if (cars.get(index).getBrand().equalsIgnoreCase(brand)) {
            return cars.get(index);
        }
        // Recursión
        return findAutoByBrand(cars, brand, index + 1);
    }

    //to string
    @Override
    public String toString() {
        return "Car: ID " + id + ", brand " + brand  + ", model " + model + ", KM " + kilometers;
    }
}
