package dia2CentroDeAtencionAlCliente.entities;

//otra clase que necesitaré será el agente, esta clase necesitara Runnable para establecer los hilos
public class Agent implements Runnable {
    private String name;
    private CallCenter callCenter;
    private boolean running;

    //Constructor (me hará falta para crear el call center y la interaccion de llamadas)
    public Agent(String name, CallCenter callCenter) {
        this.name = name;
        this.callCenter = callCenter;
        this.running = true; // el valor inicial de running
    }

    //metodo para el hilo
    @Override
    public void run() {
        //mientras el agente sea true y el call center sea true
        while (running && callCenter.isRunning()) {
            Call call = callCenter.getNextCall();//metodo para coger la siguiente llamada
            //si la llamada es null es que no hay pero si hay se cogen
            if (call != null) {
                handleCall(call);//metodo para coger la llamada
            } else {
                try {
                    Thread.sleep(1000); // Espera entre intentos de obtener llamadas
                } catch (InterruptedException e) {
                    System.err.println("Error: La conexion del agente " + name + " fue interrumpida.");
                }
            }
        }
    }
    //establecer la llamada con un cliente, uso math random para elegir que tiempo tendrá la llamada
    //necesita del objeto call, asi sabemos de que llamada se trata
    private void handleCall(Call call) {
        System.out.println(name + " esta atendiendo la llamada " + call);
        try {
            Thread.sleep((long) (Math.random() * 3000)); // Tiempo aleatorio de atención
        } catch (InterruptedException e) {
            System.err.println("Error: La conexion del agente " + name + " fue interrumpida mientras manejaba una llamada.");
        }
        System.out.println(name + " ha finalizado la llamada " + call);
    }
    //cerrar
    public void shutdown() {
        running = false;
    }
}

