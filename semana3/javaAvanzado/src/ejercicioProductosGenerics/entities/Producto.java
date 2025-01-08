package ejercicioProductosGenerics.entities;

public class Producto {
    private String nombre;
    private double precio;

    //constructores
    public Producto(){

    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    //gettersy setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //to string
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
