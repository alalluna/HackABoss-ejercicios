package martes17Animales.Entities;

public class Reptil extends Animal{
    private double longitud;
    private String tipoEscamas;
    private String tipoVeneno;
    private String habitat;

    //Contructores

    public Reptil() {
    }

    public Reptil(Integer id, String nombre, Integer edad, String tipoDePiel, String tipoDeAlimento, double longitud, String tipoEscamas, String tipoVeneno, String habitat) {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimento);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.habitat = habitat;
    }

    //Getters and setters

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public void setTipoEscamas(String tipoEscamas) {
        this.tipoEscamas = tipoEscamas;
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    //metodo

    @Override
    public void saludar() {
        super.saludar();
        System.out.println("Hola, soy un reptil");
    }

    //toString

    @Override
    public String toString() {
        return "Reptil{" +
                "longitud=" + longitud +
                ", tipoEscamas='" + tipoEscamas + '\'' +
                ", tipoVeneno='" + tipoVeneno + '\'' +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}
