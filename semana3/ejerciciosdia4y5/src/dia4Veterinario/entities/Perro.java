package dia4Veterinario.entities;
//clase hijo Perro
public class Perro extends Mascota<String> {
    public Perro(Integer codigo, String nombre, int edad) {
        super(codigo, nombre, edad, "Perro");
    }
}

