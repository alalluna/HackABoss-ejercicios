package miercoles18Vehiculo.entities;

import miercoles18Vehiculo.intefaces.Combustion;
import miercoles18Vehiculo.intefaces.Electrico;

public class Moto extends Vehiculo implements Combustion, Electrico {
    private double capacidadBateria;
    private Integer cilindrada;
    private String tipoMotor;


    //constructores
    public Moto() {
    }

    public Moto(Integer id, String placa, String marca, Integer anio, String modelo, double costo, double capacidadBateria, Integer cilindrada, String tipoMotor) {
        super(id, placa, marca, anio, modelo, costo);
        this.capacidadBateria = capacidadBateria;
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    //Getters y setters

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
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
        return "Moto{" +
                "capacidadBateria=" + capacidadBateria +
                ", cilindrada=" + cilindrada +
                ", tipoMotor='" + tipoMotor + '\'' +
                '}';
    }
}
