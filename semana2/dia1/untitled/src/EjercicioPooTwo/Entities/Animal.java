package EjercicioPooTwo.Entities;

public class Animal {
    private Integer id;
    private String nombre;
    private Integer edad;
    private String tipoDePiel;
    private String tipoDeAlimento;

    //constructor vacio
    public Animal() {
    }

    //constructor con parametros
    public Animal(Integer id, String nombre, Integer edad, String tipoDePiel, String tipoDeAlimento) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoDePiel = tipoDePiel;
        this.tipoDeAlimento = tipoDeAlimento;
    }

    //setters y getters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTipoDePiel() {
        return tipoDePiel;
    }

    public void setTipoDePiel(String tipoDePiel) {
        this.tipoDePiel = tipoDePiel;
    }

    public String getTipoDeAlimento() {
        return tipoDeAlimento;
    }

    public void setTipoDeAlimento(String tipoDeAlimento) {
        this.tipoDeAlimento = tipoDeAlimento;
    }
    public void saludar(){
        System.out.println("Hola soy un animal");
    }

}
