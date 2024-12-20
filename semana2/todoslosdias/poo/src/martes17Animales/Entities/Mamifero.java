package martes17Animales.Entities;

public class Mamifero extends Animal {
    private Integer numpatas
    private String reproduccion;
    private String pelaje;
    private String habitat;

    //Contructores

    public Mamifero() {
    }

    public Mamifero(Integer id, String nombre, Integer edad, String tipoDePiel, String tipoDeAlimento, Integer numpatas, String reproduccion, String pelaje, String habitat) {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimento);
        this.numpatas = numpatas;
        this.reproduccion = reproduccion;
        this.pelaje = pelaje;
        this.habitat = habitat;
    }

    //Getters y setters


    public Integer getNumpatas() {
        return numpatas;
    }

    public void setNumpatas(Integer numpatas) {
        this.numpatas = numpatas;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
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
        System.out.println("Hola, soy un mamifero");
    }

    //toString

    @Override
    public String toString() {
        return "Mamifero{" +
                "numpatas=" + numpatas +
                ", reproduccion='" + reproduccion + '\'' +
                ", pelaje='" + pelaje + '\'' +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}
