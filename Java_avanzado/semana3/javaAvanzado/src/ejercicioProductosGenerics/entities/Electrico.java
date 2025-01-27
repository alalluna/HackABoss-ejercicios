package ejercicioProductosGenerics.entities;

public class Electrico extends Producto{
    private String nombre;
    private double precio;
    private String marca;

    public Electrico() {
    }

    public Electrico( String nombre, double precio, String marca) {

        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Electrico{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }
}
