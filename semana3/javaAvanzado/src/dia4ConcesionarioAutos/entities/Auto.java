//package dia4ConcesionarioAutos.entities;
//
//public class Auto {
//    private String marca;
//    private String modelo;
//    private int anyo;
//    private double precio;
//
//    // Constructor, en lugar de asignar los valores directamente, llamo a los setter
//    public Auto(String marca, String modelo, int anyo, double precio) {
//        this.marca = marca;
//        this.modelo = modelo;
//        setAnyo(anyo); // Voy a usar la validación en el setter
//        setPrecio(precio);
//    }
//
//    // Getters y setters
//    public String getMarca() {
//        return marca;
//    }
//
//    public void setMarca(String marca) {
//        this.marca = marca;
//    }
//
//    public String getModelo() {
//        return modelo;
//    }
//
//    public void setModelo(String modelo) {
//        this.modelo = modelo;
//    }
//
//    public int getAnyo() {
//        return anyo;
//    }
//    //aqui va la validacion, desde 19886 año del primer vehiculo en adelante, no siendo superior al actual
//    public void setAnyo(int anyo) {
//        if (anyo >= 1886 && anyo <= java.time.Year.now().getValue()) {
//            this.anyo = anyo;
//        } else {
//            throw new IllegalArgumentException("El año debe estar entre 1886 y el actual.");
//        }
//    }
//
//    public double getPrecio() {
//        return precio;
//    }
//    //tb la validacion del precio de los autos para que sea superior a 0
//    public void setPrecio(double precio) {
//        if (precio >= 0) {
//            this.precio = precio;
//        } else {
//            throw new IllegalArgumentException("El precio no puede ser negativo.");
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Auto: Marca " + marca  +", "+ modelo +",del año "+ anyo +" y "+ precio + " euros.";
//    }
//}
