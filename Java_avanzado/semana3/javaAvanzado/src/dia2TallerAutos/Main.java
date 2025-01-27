package dia2TallerAutos;

import dia2TallerAutos.entities.LavadoAuto;
import dia2TallerAutos.entities.ReparacionAuto;

public class Main {
        public static void main(String[] args) {
            // Crear hilos para reparación (1 a 5 segundos)
            ReparacionAuto reparacion1 = new ReparacionAuto("Auto1");
            ReparacionAuto reparacion2 = new ReparacionAuto("Auto2");

            //instacias lavado
            Runnable runnable1 = new LavadoAuto("Auto3");
            Runnable runnable2 = new LavadoAuto("Auto4");
            //crear los hilos
            Thread hiloLavado1 = new Thread(runnable1);
            Thread hiloLavado2 = new Thread(runnable2);

            //iniciar los hilos
            reparacion1.start();
            reparacion2.start();
            hiloLavado1.start();
            hiloLavado2.start();

            try{
                reparacion1.join();
                reparacion2.join();
                hiloLavado1.join();
                hiloLavado2.join();
            } catch (InterruptedException e) {
                System.out.println("Ha habido un error");
            }
            System.out.println("Ha finalizado el proceso de reparación y lavado");
        }

}
