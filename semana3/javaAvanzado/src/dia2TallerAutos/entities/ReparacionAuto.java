package dia2TallerAutos.entities;

import java.util.Random;

public class ReparacionAuto extends Thread{
    private String auto;

    public ReparacionAuto(String auto) {
        this.auto = auto;
    }

    @Override
    public void run() {
        try {
            System.out.println("Iniciando reparación de " + auto + ".");
            int tiempoReparacion = new Random().nextInt(5) + 1;//+ 1 porque no incluye el limite, es decir el 5
            Thread.sleep(tiempoReparacion * 1000); // Pausa para simular el tiempo del proceso
            System.out.println("Reparación de " + auto + " completado en " + tiempoReparacion + " segundos.");
        } catch (InterruptedException e) {
            throw new Error("Ha habido un error en la reparación");
        }

    }
}
