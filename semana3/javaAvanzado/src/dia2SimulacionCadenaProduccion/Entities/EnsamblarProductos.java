package dia2SimulacionCadenaProduccion.Entities;

import java.util.Random;

public class EnsamblarProductos implements Runnable{
    private String trabajador;

    public EnsamblarProductos(String trabajador) {
        this.trabajador = trabajador;
    }

    @Override
    public void run() {
        try {
            int tiempo = 1000;
            Thread.sleep(tiempo); // Pausa para simular el tiempo del proceso
            System.out.println("Ensamblaje completado por " + trabajador + " en " + tiempo + " segundos.");
        } catch (InterruptedException e) {
            throw new Error("Ha habido un error en el ensamblaje");
        }
    }

    public void start(){

    }
    public void join(){

    }
}
