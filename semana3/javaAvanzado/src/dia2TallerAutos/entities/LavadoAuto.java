package dia2TallerAutos.entities;

import java.util.Random;

public class LavadoAuto implements Runnable{
    private final String auto;

    public LavadoAuto(String auto) {
        this.auto = auto;
    }

    @Override
    public void run() {
        try {
            System.out.println("Iniciando lavado " + auto + ".");
            int tiempoLavado = new Random().nextInt(3) + 1;
            Thread.sleep(tiempoLavado * 1000); // Pausa para simular el tiempo del proceso
            System.out.println("Lavado de " + auto + " completado en " + tiempoLavado + " segundos.");
        } catch (InterruptedException e) {
            throw new Error("Ha habido un error");
        }
    }

    public void start() {
    }

    public void join() {
    }
}
