package martes17vestimenta.Entities;

public class Sombrero extends Vestimenta{

    private String tipo;
    private String tamanyo;

    //Constructores
    public Sombrero() {
    }

    public Sombrero(String codigo, String nombre, double precio, String marca, String talla, String color, String tipo, String tamanyo) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamanyo = tamanyo;
    }


    //Getters y setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(String tamanyo) {
        this.tamanyo = tamanyo;
    }

    //toString
    @Override
    public String toString() {
        return "Sombrero{" +
                "tipo='" + tipo + '\'' +
                ", tamanyo='" + tamanyo + '\'' +
                '}';
    }
}
