package dia2SimulacionCadenaProduccion.Entities;

import java.util.Random;

public class EmbalarProductos implements Runnable {
    private String trabajador;

    public EmbalarProductos(String trabajador) {
        this.trabajador = trabajador;
    }

    @Override
    public void run() {
        try {
            int tiempo = 1000;
            Thread.sleep(tiempo); // Simula tiempo de embalaje
            System.out.println("Embalaje completado por " + trabajador + " en " + tiempo + " segundos.");
        } catch (InterruptedException e) {
            throw new Error("Ha habido un error en el embalaje");
        }
    }
    public void start(){

    }
    public void join(){

    }
}
