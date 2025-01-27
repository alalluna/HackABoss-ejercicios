package dia2SimulacionCadenaProduccion.Entities;

import java.util.Random;

public class RealizarControlesCalidad implements Runnable {
    private String trabajador;

    public RealizarControlesCalidad(String trabajador) {
        this.trabajador = trabajador;
    }

    @Override
    public void run() {
        try {
            int tiempo = 1000;
            Thread.sleep(tiempo); // Simula tiempo de revisión
            System.out.println("Control de calidad completado por " + trabajador + " en " + tiempo + " segundos.");
        } catch (InterruptedException e) {
            throw new Error("Ha habido un error en el control de calidad");
        }
    }
    public void start(){

    }
    public void join(){

    }
}
