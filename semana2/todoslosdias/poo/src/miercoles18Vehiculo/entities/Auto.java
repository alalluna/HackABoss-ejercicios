package miercoles18Vehiculo.entities;

import miercoles18Vehiculo.intefaces.Combustion;
import miercoles18Vehiculo.intefaces.Electrico;

public class Auto extends Vehiculo implements Electrico , Combustion {
    private double capacidadBateria;
    private double autonomia;
    private Integer capacidadTanque;


    //constructores

    public Auto() {
    }

    public Auto(Integer id, String placa, String marca, Integer anio, String modelo, double costo, double capacidadBateria, double autonomia,Integer capacidadTanque) {
        super(id, placa, marca, anio, modelo, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
        this.capacidadTanque = capacidadTanque;
    }

    //Getters y setters
    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public Integer getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(Integer capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    //metodos
    @Override
    public int calcularAntiguedad() {
        Integer anioActual = 2024;
        return anioActual - super.anio;
    }

    @Override
    public void cargarEnergia() {
        System.out.println("cargando baterias hasta "+ this.capacidadBateria + " mah.");
    }

    @Override
    public void recargarCombustion() {
        System.out.println("Recargando combustible hasta "+ this.capacidadTanque + " litros.");
    }

    //toString

    @Override
    public String toString() {
        return "Auto{" +
                "capacidadBateria=" + capacidadBateria +
                ", autonomia=" + autonomia +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }
}
