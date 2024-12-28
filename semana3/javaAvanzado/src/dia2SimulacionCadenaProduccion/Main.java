package dia2SimulacionCadenaProduccion;

import dia2SimulacionCadenaProduccion.Entities.EmbalarProductos;
import dia2SimulacionCadenaProduccion.Entities.EnsamblarProductos;
import dia2SimulacionCadenaProduccion.Entities.RealizarControlesCalidad;

public class Main {
    public static void main(String[] args) {
        //Crear hilos para los trabajadores
        Runnable tarea1 = new EnsamblarProductos("Oscar");
        Runnable tarea2 = new EnsamblarProductos("Lola");
        Runnable tarea3 = new EmbalarProductos("Javier");
        Runnable tarea4 = new EmbalarProductos("Lucia");
        Runnable tarea5 = new RealizarControlesCalidad("Jordi");
        Runnable tarea6 = new RealizarControlesCalidad("Llacer");

        Thread trabajo1 = new Thread(tarea1);
        Thread trabajo2 = new Thread(tarea2);
        Thread trabajo3 = new Thread(tarea3);
        Thread trabajo4 = new Thread(tarea4);
        Thread trabajo5 = new Thread(tarea5);
        Thread trabajo6 = new Thread(tarea6);


        try{
            trabajo1.start();
            trabajo1.join();

            trabajo2.start();
            trabajo2.join();

            trabajo3.start();
            trabajo3.join();

            trabajo4.start();
            trabajo4.join();

            trabajo5.start();
            trabajo5.join();

            trabajo6.start();
            trabajo6.join();
        } catch (InterruptedException e) {
            System.out.println("Ha habido un error");
        }
        System.out.println("Ha finalizado el trabajo en cadena");
        }
    }

