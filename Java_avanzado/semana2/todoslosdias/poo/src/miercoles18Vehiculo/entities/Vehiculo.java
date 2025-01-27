package miercoles18Vehiculo.entities;

public abstract class Vehiculo {
    //al menos uno de los métodos será abstracto
    private Integer id;
    private String placa;
    private String marca;
    private String modelo;
    protected Integer anio;
    private double costo;


    //constructores
    public Vehiculo() {
    }

    public Vehiculo(Integer id, String placa, String marca, Integer anio, String modelo, double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
        this.costo = costo;
    }

    //Getters y setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public abstract int calcularAntiguedad();

    public int calcularAntiguedad2(){
        return 2;
    }

    //toString
    @Override
    public String toString() {
        return "Vehiculo{" +
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", costo=" + costo +
                '}';
    }
}
