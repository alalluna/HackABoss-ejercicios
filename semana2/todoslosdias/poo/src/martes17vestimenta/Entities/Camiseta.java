package martes17vestimenta.Entities;

public class Camiseta extends Vestimenta{

    private String manga;
    private String cuello;

    //constructores
    public Camiseta() {
    }

    public Camiseta(String codigo, String nombre, double precio, String marca, String talla, String color, String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }
    // Getters and setters
    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }


    //toString
    @Override
    public String toString() {
        return "Camiseta{" +
                "manga='" + manga + '\'' +
                ", cuello='" + cuello + '\'' +
                '}';
    }
}
