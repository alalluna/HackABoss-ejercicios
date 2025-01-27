package miercoles18Vehiculo.entities;

import miercoles18Vehiculo.intefaces.Combustion;
import miercoles18Vehiculo.intefaces.Electrico;

public class Camioneta extends Vehiculo implements Combustion , Electrico {

    private Integer capacidadTanque;
    private Integer consumoCombustible;
    private double capacidadBateria;

    //constructores
    public Camioneta() {
    }

    public Camioneta(Integer id, String placa, String marca, Integer anio, String modelo, double costo, Integer capacidadTanque, Integer consumoCombustible, double capacidadBateria) {
        super(id, placa, marca, anio, modelo, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
        this.capacidadBateria = capacidadBateria;
    }


    //Getters y setters
    public Integer getCapacidadTanque() {
        return capacidadTanque;
    }


    public void setCapacidadTanque(Integer capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public Integer getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(Integer consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }
    //metodos

    @Override
    public void recargarCombustion() {
        System.out.println("Recargando combustible hasta "+ this.capacidadTanque + " litros.");
    }

    @Override
    public int calcularAntiguedad() {
        Integer anioActual = 2024;
        return anioActual - super.anio;
    }
    @Override
    public void cargarEnergia() {
        System.out.println("cargando baterias hasta "+ this.capacidadBateria + " mah.")
    }

    //toString


    @Override
    public String toString() {
        return "Camioneta{" +
                "capacidadTanque=" + capacidadTanque +
                ", consumoCombustible=" + consumoCombustible +
                ", capacidadBateria=" + capacidadBateria +
                '}';
    }
}
