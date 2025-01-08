package ejercicioProductosGenerics.entities;

public class Ropa extends Producto{
    private String nombre;
    private double precio;
    private String talla;
    private String material;

    public Ropa() {
    }

    public Ropa(String nombre, double precio, String talla, String material) {
        this.nombre = nombre;
        this.precio = precio;
        this.talla = talla;
        this.material = material;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", talla='" + talla + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
