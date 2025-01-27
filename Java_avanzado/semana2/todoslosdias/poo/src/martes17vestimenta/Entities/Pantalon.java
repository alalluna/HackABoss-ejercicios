package martes17vestimenta.Entities;

public class Pantalon extends Vestimenta{
    private String estilo;
    private String tejido;

    //Contructores
    public Pantalon() {
    }

    public Pantalon(String codigo, String nombre, double precio, String marca, String talla, String color, String estilo, String tejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tejido = tejido;
    }

    //Getters y setters
    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTejido() {
        return tejido;
    }

    public void setTejido(String tejido) {
        this.tejido = tejido;
    }

    //toString
    @Override
    public String toString() {
        return "Pantalon{" +
                "estilo='" + estilo + '\'' +
                ", tejido='" + tejido + '\'' +
                '}';
    }
}
