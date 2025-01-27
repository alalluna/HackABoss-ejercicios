package dia2CentroDeAtencionAlCliente.entities;
//la clase principal sera la llamada(call). Esta es bastante simple y establece la llamada entrante, como parametro tiene al cliente
public class Call {
    private String clientName;

    //contructor
    public Call(String clientName) {
        this.clientName = clientName;
    }

    // getters and setters
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    //tostring personalizado
    @Override
    public String toString() {
        return "cliente " + clientName;

    }
}
