package dia2CentroDeAtencionAlCliente.entities;

import java.util.ArrayList;
import java.util.List;

//la clase callCenter necesitara la cola de llamadas y los agentes
public class CallCenter {
    private List<Call> callQueue;
    private Agent[] agents;
    private boolean running;

    public CallCenter(int numberOfAgents) {
        //lista de llamadas entrantes
        callQueue = new ArrayList<>();
        agents = new Agent[numberOfAgents];
        //bucle for para recorrer los agentes y que pudieran coger las llamadas
        for (int i = 0; i < numberOfAgents; i++) {
            agents[i] = new Agent("Agente " + (i + 1), this);
        }
        //el call center esta funcionando
        running = true;
    }

    //coger una llamada
    public void addCall(String clientName) {
        //siempre y cuando el call center funcione
        if (running) {
            //creo una nueva llamada
            Call call = new Call(clientName);
            //la añado a la lista de llamadas
            callQueue.add(call);
            System.out.println("Recibiendo la llamada " + call);
        }
    }

    //para iniciar el hilo de llamadas
    public void start() {
        //para recorrer el arreglo de agentes y poder crear hilos
        for (Agent agent : agents) {
            new Thread(agent).start(); // Cada agente corre en un hilo separado y se crean aqui
        }
    }

    //coger la siguiente llamada
    public Call getNextCall() {
        //si hay llamadas, es decir la lista no esta vacia se pueden devolver llamadas
        if (!callQueue.isEmpty()) {
            return callQueue.remove(0); //elimina y devuelve la primera llamada de la lista
        }
        //si no hay llamadas , devuelve null
        return null;
    }

    //cerrar el call center
    public void shutdown() {
        running = false; // Detiene el centro de atención
    }

    //para controlar el estado del call center
    public boolean isRunning() {
        return running;
    }
}
