package entities;

public class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private String categoria;
    private String marca;

    //constructor builder
    private Producto(ConstruirProducto builder) {
        this.nombre = builder.nombre;
        this.descripcion = builder.descripcion;
        this.precio = builder.precio;
        this.categoria = builder.categoria;
        this.marca = builder.marca;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    // Clase estatica ConstruirProducto
    public static class ConstruirProducto {
        private String nombre;
        private String descripcion;
        private double precio;
        private String categoria;
        private String marca;

        public ConstruirProducto() {
        //constructor vacio para constructor builder
        }


        //setter del builder
        public ConstruirProducto consNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public ConstruirProducto consDescripcion(String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        public ConstruirProducto consPrecio(double precio) {
            this.precio = precio;
            return this;
        }

        public ConstruirProducto consCategoria(String categoria) {
            this.categoria = categoria;
            return this;
        }

        public ConstruirProducto consMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public Producto construir(){
            return new Producto (this);
        }
    }
}
