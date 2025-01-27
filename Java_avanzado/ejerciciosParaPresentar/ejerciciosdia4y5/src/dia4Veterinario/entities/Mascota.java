package dia4Veterinario.entities;

public class Mascota<T> {
    //clase padre Mascota sera el generico T de typo
    private Integer codigo; // ID de la mascota
    private String nombre;
    private int edad;
    private String especie;

    // Constructor
    public Mascota(Integer codigo, String nombre, int edad, String especie) {
        this.codigo = codigo;
        this.nombre = nombre;
        setEdad(edad);//la edad viene validada en el set, asi que no asigno directamente el valor edad
        this.especie = especie;
    }

    // Getters y Setters
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    //aqui valido la edad . primero pongo el happy path
    public void setEdad(int edad) {
        // Validar que la edad
        if (edad > 0 && edad < 20) {
            this.edad = edad;
        }else{
            throw new IllegalArgumentException("La edad debe estar entre 0 y 20 años.");
        }

    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    //to string
    @Override
    public String toString() {
        return "Mascota [Codigo=" + codigo + ", Nombre=" + nombre + ", Edad=" + edad + ", Especie=" + especie + "]";
    }
}
