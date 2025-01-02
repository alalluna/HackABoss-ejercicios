package dia2CentroDeAtencionAlCliente;

import dia2CentroDeAtencionAlCliente.entities.CallCenter;

public class Main {
    public static void main(String[] args) {
        int numberOfAgents = 3; // Numero de agentes
        CallCenter callCenter = new CallCenter(numberOfAgents);
        callCenter.start(); // Metodo para iniciar los agentes

        // Simulando llamadas entrantes
        for (int i = 1; i <= 20; i++) {
            callCenter.addCall("numero " + i);//metodo para añadir llamadas
            try {
                Thread.sleep(500); // Tiempo entre llamadas entrantes
            } catch (InterruptedException e) {
                //personlizo el mensaje de error de interumpedExeption
                System.err.println("Error: La conexion principal fue interrumpida mientras se simulaban llamadas.");
            }
        }

        callCenter.shutdown(); // metodo para cerrar
    }
}
